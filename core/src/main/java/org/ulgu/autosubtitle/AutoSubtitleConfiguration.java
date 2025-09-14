
package org.ulgu.autosubtitle;

import net.labymod.api.configuration.ConfigProperty;
import net.labymod.api.configuration.annotation.IntMin;
import net.labymod.api.configuration.annotation.IntMax;
import net.labymod.api.configuration.annotation.TextFieldName;
import net.labymod.api.configuration.annotation.ConfigName;

@ConfigName("autosubtitle")
public class AutoSubtitleConfiguration {

    @IntMin(0) @IntMax(50)
    @TextFieldName("Years")
    private final ConfigProperty<Integer> years = new ConfigProperty<>(1);

    @IntMin(0) @IntMax(12)
    @TextFieldName("Months")
    private final ConfigProperty<Integer> months = new ConfigProperty<>(7);

    @IntMin(0) @IntMax(31)
    @TextFieldName("Days")
    private final ConfigProperty<Integer> days = new ConfigProperty<>(8);

    @IntMin(0) @IntMax(23)
    @TextFieldName("Hours")
    private final ConfigProperty<Integer> hours = new ConfigProperty<>(23);

    @IntMin(0) @IntMax(59)
    @TextFieldName("Minutes")
    private final ConfigProperty<Integer> minutes = new ConfigProperty<>(34);

    @IntMin(0) @IntMax(59)
    @TextFieldName("Seconds")
    private final ConfigProperty<Integer> seconds = new ConfigProperty<>(59);

    public ConfigProperty<Integer> years() { return years; }
    public ConfigProperty<Integer> months() { return months; }
    public ConfigProperty<Integer> days() { return days; }
    public ConfigProperty<Integer> hours() { return hours; }
    public ConfigProperty<Integer> minutes() { return minutes; }
    public ConfigProperty<Integer> seconds() { return seconds; }
}
