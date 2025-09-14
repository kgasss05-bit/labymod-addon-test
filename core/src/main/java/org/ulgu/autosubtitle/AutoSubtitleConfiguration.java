package org.ulgu.autosubtitle;

/**
 * Einfache Konfigurationswerte (ohne Laby-Annotations), damit alles kompiliert.
 * Grenzen wie besprochen:
 * - month: 0-12
 * - yearOffset: 0-50
 * - day: 0-31
 * - hour: 0-24
 * - minute/second: 0-60
 */
public class AutoSubtitleConfiguration {
    private int month;       // 0-12
    private int yearOffset;  // 0-50
    private int day;         // 0-31
    private int hour;        // 0-24
    private int minute;      // 0-60
    private int second;      // 0-60

    public AutoSubtitleConfiguration() {
        // defaults
        this.month = 0;
        this.yearOffset = 0;
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = clamp(month, 0, 12); }

    public int getYearOffset() { return yearOffset; }
    public void setYearOffset(int yearOffset) { this.yearOffset = clamp(yearOffset, 0, 50); }

    public int getDay() { return day; }
    public void setDay(int day) { this.day = clamp(day, 0, 31); }

    public int getHour() { return hour; }
    public void setHour(int hour) { this.hour = clamp(hour, 0, 24); }

    public int getMinute() { return minute; }
    public void setMinute(int minute) { this.minute = clamp(minute, 0, 60); }

    public int getSecond() { return second; }
    public void setSecond(int second) { this.second = clamp(second, 0, 60); }

    private int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }
}