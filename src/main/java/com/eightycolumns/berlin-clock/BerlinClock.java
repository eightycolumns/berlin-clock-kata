package com.eightycolumns.berlin_clock;

class BerlinClock {
  public static String secondsLamp(int second) {
    return (second % 2 == 0) ? "1" : "0";
  }
}
