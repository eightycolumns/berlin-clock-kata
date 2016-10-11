package com.eightycolumns.berlin_clock;

class SecondsLamp {
  private int second;

  SecondsLamp(int second) {
    if (second < 0 || second > 59) {
      throw new InvalidSecondException();
    }

    this.second = second;
  }

  String toBinaryString() {
    return isEven(second) ? "1" : "0";
  }

  private boolean isEven(int d) {
    return d % 2 == 0;
  }
}
