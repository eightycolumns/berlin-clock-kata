package com.eightycolumns.berlin_clock;

final class SecondsLamp {
  private final int second;

  private SecondsLamp(int second) {
    if (second < 0 || second > 59) {
      throw new InvalidSecondException();
    }

    this.second = second;
  }

  static SecondsLamp atSecond(int second) {
    return new SecondsLamp(second);
  }

  String toBinaryString() {
    return isEven(second) ? "1" : "0";
  }

  private boolean isEven(int d) {
    return d % 2 == 0;
  }
}
