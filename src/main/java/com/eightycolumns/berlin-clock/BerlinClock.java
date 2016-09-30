package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }

  public static String fiveHourRow(int hour) {
    return repeat('1', hour / 5) + repeat('0', 4 - hour / 5);
  }

  public static String oneHourRow(int hour) {
    return repeat('1', hour % 5) + repeat('0', 4 - hour % 5);
  }

  public static String fiveMinuteRow(int minute) {
    return repeat('1', minute / 5) + repeat('0', 11 - minute / 5);
  }

  public static String oneMinuteRow(int minute) {
    return repeat('1', minute % 5) + repeat('0', 4 - minute % 5);
  }

  private static String repeat(char c, int n) {
    String s = "";

    for (int i = 0; i < n; i += 1) {
      s += c;
    }

    return s;
  }
}
