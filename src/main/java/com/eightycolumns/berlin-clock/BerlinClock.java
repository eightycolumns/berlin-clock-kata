package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }

  public static String fiveHourRow(int hour) {
    String row = "";

    for (int i = 0; i < hour / 5; i += 1) {
      row += "1";
    }

    while (row.length() < 4) {
      row += "0";
    }

    return row;
  }

  public static String oneHourRow(int hour) {
    String row = "";

    for (int i = 0; i < hour % 5; i += 1) {
      row += "1";
    }

    while (row.length() < 4) {
      row += "0";
    }

    return row;
  }
}
