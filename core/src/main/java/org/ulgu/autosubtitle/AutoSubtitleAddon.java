
package org.ulgu.autosubtitle;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;
import net.labymod.api.client.gui.screen.widget.widgets.LabelWidget;

@AddonMain
public class AutoSubtitleAddon extends LabyAddon<AutoSubtitleConfiguration> {

    @Override
    protected void enable() {
        this.logger().info("AutoSubtitleAddon enabled!");
    }

    @Override
    protected Class<AutoSubtitleConfiguration> configurationClass() {
        return AutoSubtitleConfiguration.class;
    }
}
