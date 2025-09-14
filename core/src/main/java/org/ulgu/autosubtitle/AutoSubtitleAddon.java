package org.ulgu.autosubtitle;

import net.labymod.api.addon.Addon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AutoSubtitleAddon extends Addon<AutoSubtitleConfiguration> {

    @Override
    protected void enable() {
        this.logger().info("AutoSubtitle Addon enabled!");
    }

    @Override
    protected Class<AutoSubtitleConfiguration> configurationClass() {
        return AutoSubtitleConfiguration.class;
    }
}
