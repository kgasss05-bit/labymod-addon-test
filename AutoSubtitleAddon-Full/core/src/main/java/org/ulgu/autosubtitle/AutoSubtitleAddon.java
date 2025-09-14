package org.ulgu.autosubtitle;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AutoSubtitleAddon extends LabyAddon<AutoSubtitleConfiguration> {

  private SubtitleTicker ticker;

  @Override
  protected void enable() {
    this.registerSettingCategory();
    this.ticker = new SubtitleTicker(this);
    this.logger().info("AutoSubtitleAddon enabled");
  }

  @Override
  protected Class<AutoSubtitleConfiguration> configurationClass() {
    return AutoSubtitleConfiguration.class;
  }
}
