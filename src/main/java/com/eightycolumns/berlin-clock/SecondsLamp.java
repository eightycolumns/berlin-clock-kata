package com.eightycolumns.berlin_clock;

class SecondsLamp {
  private SecondsLamp() {
    // Suppress default constructor
  }

  static String atSecond(int second) {
    if (second < 0 || second > 59) {
      throw new InvalidSecondException();
    }

    return isEven(second) ? "1" : "0";
  }

  private static boolean isEven(int d) {
    return d % 2 == 0;
  }
}
