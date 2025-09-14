package org.ulgu.autosubtitle;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.IntegerWidget.IntegerSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;

@ConfigName("settings")
public class AutoSubtitleConfiguration extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @IntegerSetting
  private final ConfigProperty<Integer> years = new ConfigProperty<>(1);
  @IntegerSetting
  private final ConfigProperty<Integer> months = new ConfigProperty<>(7);
  @IntegerSetting
  private final ConfigProperty<Integer> days = new ConfigProperty<>(8);
  @IntegerSetting
  private final ConfigProperty<Integer> hours = new ConfigProperty<>(23);
  @IntegerSetting
  private final ConfigProperty<Integer> minutes = new ConfigProperty<>(34);
  @IntegerSetting
  private final ConfigProperty<Integer> seconds = new ConfigProperty<>(59);

  @Override
  public ConfigProperty<Boolean> enabled() { return this.enabled; }

  public ConfigProperty<Integer> years() { return this.years; }
  public ConfigProperty<Integer> months() { return this.months; }
  public ConfigProperty<Integer> days() { return this.days; }
  public ConfigProperty<Integer> hours() { return this.hours; }
  public ConfigProperty<Integer> minutes() { return this.minutes; }
  public ConfigProperty<Integer> seconds() { return this.seconds; }
}
