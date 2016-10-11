package com.eightycolumns.berlin_clock;

class FiveHourRow extends Row {
  private int hour;

  FiveHourRow(int hour) {
    if (hour < 0 || hour > 23) {
      throw new InvalidHourException();
    }

    this.hour = hour;
  }

  String binaryString() {
    int n_lights = 4;
    int n_lights_on = hour / 5;

    return row(n_lights, n_lights_on);
  }
}
