package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }

  public static String fiveHourRow(int hour) {
    String row = "";

    if (hour / 5 > 0) {
      row += "1";
    }

    while (row.length() < 4) {
      row += "0";
    }

    return row;
  }
}
