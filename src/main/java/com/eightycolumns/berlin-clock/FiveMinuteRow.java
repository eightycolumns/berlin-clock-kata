package com.eightycolumns.berlin_clock;

final class FiveMinuteRow extends Row {
  private final int minute;

  private FiveMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new InvalidMinuteException();
    }

    this.minute = minute;
  }

  static FiveMinuteRow atMinute(int minute) {
    return new FiveMinuteRow(minute);
  }

  String toBinaryString() {
    int n_lights = 11;
    int n_lights_on = minute / 5;

    return row(n_lights, n_lights_on);
  }
}
