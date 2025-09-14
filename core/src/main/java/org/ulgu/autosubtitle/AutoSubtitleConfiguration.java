package org.ulgu.autosubtitle;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.addon.annotation.AddonMain;
import net.labymod.api.client.gui.screen.widget.widgets.input.settings.IntegerSetting;

@AddonMain
public class AutoSubtitleConfiguration extends AddonConfig {

  @IntegerSetting(min = 0, max = 10)
  private int subtitleSpeed;

  @IntegerSetting(min = 0, max = 12)
  private int subtitleSize;

  @IntegerSetting(min = 0, max = 365)
  private int subtitleLifetime;

  @IntegerSetting(min = 0, max = 24)
  private int subtitleHours;

  @IntegerSetting(min = 0, max = 60)
  private int subtitleMinutes;

  @IntegerSetting(min = 0, max = 60)
  private int subtitleSeconds;

  @Override
  public String getNamespace() {
    return "autosubtitle";
  }
}
