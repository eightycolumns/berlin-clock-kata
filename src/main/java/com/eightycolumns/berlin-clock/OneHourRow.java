package com.eightycolumns.berlin_clock;

final class OneHourRow extends Row {
  private final int hour;

  private OneHourRow(int hour) {
    if (hour < 0 || hour > 23) {
      throw new InvalidHourException();
    }

    this.hour = hour;
  }

  static OneHourRow atHour(int hour) {
    return new OneHourRow(hour);
  }

  String toBinaryString() {
    int n_lights = 4;
    int n_lights_on = hour % 5;

    return row(n_lights, n_lights_on);
  }
}
