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
    int nLights = 4;
    int nLightsOn = hour % 5;
    int nLightsOff = nLights - nLightsOn;

    return repeat('1', nLightsOn) + repeat('0', nLightsOff);
  }
}
