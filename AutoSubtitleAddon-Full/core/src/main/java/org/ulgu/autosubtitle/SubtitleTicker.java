package org.ulgu.autosubtitle;

import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.lifecycle.GameTickEvent;
import net.labymod.api.event.Phase;

public class SubtitleTicker {

  private final AutoSubtitleAddon addon;
  private long lastSecondMs = 0;

  public SubtitleTicker(AutoSubtitleAddon addon) {
    this.addon = addon;
    this.addon.registerListener(this);
  }

  @Subscribe
  public void onTick(GameTickEvent event) {
    if (event.phase() != Phase.PRE) return;
    if (!this.addon.configuration().enabled().get()) return;

    long nowMs = System.currentTimeMillis();
    if (nowMs - lastSecondMs < 1000) return;
    lastSecondMs = nowMs;

    long remaining = calcTotalSeconds();
    if (remaining <= 0) return;

    String pretty = format(remaining);
    this.addon.labyAPI().minecraft().chatExecutor().chat("/subtitle §c" + pretty + " left");
  }

  private long calcTotalSeconds() {
    long years  = this.addon.configuration().years().get();
    long months = this.addon.configuration().months().get();
    long days   = this.addon.configuration().days().get();
    long hours  = this.addon.configuration().hours().get();
    long mins   = this.addon.configuration().minutes().get();
    long secs   = this.addon.configuration().seconds().get();
    return (((years*365 + months*30 + days)*24 + hours)*60 + mins)*60 + secs;
  }

  private String format(long s) {
    long years  = s / (365L*24*3600); s %= 365L*24*3600;
    long months = s / (30L*24*3600);  s %= 30L*24*3600;
    long days   = s / (24*3600);      s %= 24*3600;
    long hours  = s / 3600;           s %= 3600;
    long mins   = s / 60;
    long secs   = s % 60;
    return years + "y " + months + "M " + days + "d " + hours + "h " + mins + "m " + secs + "s";
  }
}
