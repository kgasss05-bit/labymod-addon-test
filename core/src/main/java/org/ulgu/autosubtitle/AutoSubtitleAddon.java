package org.ulgu.autosubtitle;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AutoSubtitleAddon extends LabyAddon<AutoSubtitleConfiguration> {

    @Override
    protected void enable() {
        this.logger().info("AutoSubtitle Addon enabled!");
    }

    @Override
    protected Class<? extends AutoSubtitleConfiguration> configurationClass() {
        return AutoSubtitleConfiguration.class;
    }
}
