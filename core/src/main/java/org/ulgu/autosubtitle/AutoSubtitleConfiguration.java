package org.ulgu.autosubtitle;

import net.labymod.api.client.gui.screen.widget.widgets.input.slider.SliderSetting;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class AutoSubtitleConfiguration {

  @SliderSetting(min = 0, max = 10)
  private final ConfigProperty<Integer> years = new ConfigProperty<>(1);

  @SliderSetting(min = 0, max = 12)
  private final ConfigProperty<Integer> months = new ConfigProperty<>(7);

  @SliderSetting(min = 0, max = 365)
  private final ConfigProperty<Integer> days = new ConfigProperty<>(8);

  @SliderSetting(min = 0, max = 24)
  private final ConfigProperty<Integer> hours = new ConfigProperty<>(23);

  @SliderSetting(min = 0, max = 60)
  private final ConfigProperty<Integer> minutes = new ConfigProperty<>(34);

  @SliderSetting(min = 0, max = 60)
  private final ConfigProperty<Integer> seconds = new ConfigProperty<>(59);

  public ConfigProperty<Integer> years() {
    return years;
  }

  public ConfigProperty<Integer> months() {
    return months;
  }

  public ConfigProperty<Integer> days() {
    return days;
  }

  public ConfigProperty<Integer> hours() {
    return hours;
  }

  public ConfigProperty<Integer> minutes() {
    return minutes;
  }

  public ConfigProperty<Integer> seconds() {
    return seconds;
  }
}
