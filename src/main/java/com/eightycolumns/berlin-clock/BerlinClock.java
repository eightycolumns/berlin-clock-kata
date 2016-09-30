package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }

  public static String fiveHourRow(int hour) {
    int n_lights = 4;
    return repeat('1', hour / 5) + repeat('0', n_lights - hour / 5);
  }

  public static String oneHourRow(int hour) {
    int n_lights = 4;
    return repeat('1', hour % 5) + repeat('0', n_lights - hour % 5);
  }

  public static String fiveMinuteRow(int minute) {
    int n_lights = 11;
    return repeat('1', minute / 5) + repeat('0', n_lights - minute / 5);
  }

  public static String oneMinuteRow(int minute) {
    int n_lights = 4;
    return repeat('1', minute % 5) + repeat('0', n_lights - minute % 5);
  }

  private static String repeat(char c, int n) {
    String s = "";

    for (int i = 0; i < n; i += 1) {
      s += c;
    }

    return s;
  }
}
