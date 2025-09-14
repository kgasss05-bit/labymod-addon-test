package org.ulgu.autosubtitle;

import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class AutoSubtitleConfiguration {

    @SliderSetting(min = 0, max = 50)
    private final ConfigProperty<Integer> years = new ConfigProperty<>(1);

    @SliderSetting(min = 0, max = 12)
    private final ConfigProperty<Integer> months = new ConfigProperty<>(6);

    @SliderSetting(min = 0, max = 31)
    private final ConfigProperty<Integer> days = new ConfigProperty<>(15);

    @SliderSetting(min = 0, max = 23)
    private final ConfigProperty<Integer> hours = new ConfigProperty<>(12);

    @SliderSetting(min = 0, max = 59)
    private final ConfigProperty<Integer> minutes = new ConfigProperty<>(30);

    @SliderSetting(min = 0, max = 59)
    private final ConfigProperty<Integer> seconds = new ConfigProperty<>(45);

    public ConfigProperty<Integer> years() { return years; }
    public ConfigProperty<Integer> months() { return months; }
    public ConfigProperty<Integer> days() { return days; }
    public ConfigProperty<Integer> hours() { return hours; }
    public ConfigProperty<Integer> minutes() { return minutes; }
    public ConfigProperty<Integer> seconds() { return seconds; }
}
