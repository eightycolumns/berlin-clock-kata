package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }

  public static String fiveHourRow(int hour) {
    int n_lights = 4;
    int n_lights_on = hour / 5;
    int n_lights_off = n_lights - n_lights_on;

    return repeat('1', n_lights_on) + repeat('0', n_lights_off);
  }

  public static String oneHourRow(int hour) {
    int n_lights = 4;
    int n_lights_on = hour % 5;
    int n_lights_off = n_lights - n_lights_on;

    return repeat('1', n_lights_on) + repeat('0', n_lights_off);
  }

  public static String fiveMinuteRow(int minute) {
    int n_lights = 11;
    int n_lights_on = minute / 5;
    int n_lights_off = n_lights - n_lights_on;

    return repeat('1', n_lights_on) + repeat('0', n_lights_off);
  }

  public static String oneMinuteRow(int minute) {
    int n_lights = 4;
    int n_lights_on = minute % 5;
    int n_lights_off = n_lights - n_lights_on;

    return repeat('1', n_lights_on) + repeat('0', n_lights_off);
  }

  private static String repeat(char c, int n) {
    String s = "";

    for (int i = 0; i < n; i += 1) {
      s += c;
    }

    return s;
  }
}
