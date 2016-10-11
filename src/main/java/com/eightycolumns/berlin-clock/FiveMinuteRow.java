package com.eightycolumns.berlin_clock;

class FiveMinuteRow extends Row {
  private int minute;

  FiveMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new InvalidMinuteException();
    }

    this.minute = minute;
  }

  String binaryString() {
    int n_lights = 11;
    int n_lights_on = minute / 5;

    return row(n_lights, n_lights_on);
  }
}
