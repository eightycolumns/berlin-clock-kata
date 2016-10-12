package com.eightycolumns.berlin_clock;

final class FiveHourRow extends Row {
  private final int hour;

  private FiveHourRow(int hour) {
    if (hour < 0 || hour > 23) {
      throw new InvalidHourException();
    }

    this.hour = hour;
  }

  static FiveHourRow atHour(int hour) {
    return new FiveHourRow(hour);
  }

  String toBinaryString() {
    int nLights = 4;
    int nLightsOn = hour / 5;
    int nLightsOff = nLights - nLightsOn;

    return repeat('1', nLightsOn) + repeat('0', nLightsOff);
  }
}
