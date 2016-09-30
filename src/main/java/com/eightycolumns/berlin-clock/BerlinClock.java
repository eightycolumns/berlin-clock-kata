package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }

  public static String fiveHourRow(int hour) {
    return "0000";
  }
}
