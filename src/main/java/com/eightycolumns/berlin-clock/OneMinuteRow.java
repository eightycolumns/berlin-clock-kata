package com.eightycolumns.berlin_clock;

class OneMinuteRow extends Row {
  private int minute;

  OneMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new InvalidMinuteException();
    }

    this.minute = minute;
  }

  String toBinaryString() {
    int n_lights = 4;
    int n_lights_on = minute % 5;

    return row(n_lights, n_lights_on);
  }
}
