package org.ulgu.autosubtitle;

import net.labymod.api.addon.AddonConfig;

public class AutoSubtitleConfiguration extends AddonConfig {
    // Simplified config (no broken annotations)
    private int maxMinutes = 60;

    public int getMaxMinutes() {
        return maxMinutes;
    }

    @Override
    public boolean enabled() {
        return true;
    }
}
