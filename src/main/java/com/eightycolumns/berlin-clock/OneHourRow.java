package com.eightycolumns.berlin_clock;

class OneHourRow {
  private OneHourRow() {
    // Suppress default constructor
  }

  static String atHour(int hour) {
    if (hour < 0 || hour > 23) {
      throw new InvalidHourException();
    }

    int n_lights = 4;
    int n_lights_on = hour % 5;

    return row(n_lights, n_lights_on);
  }

  private static String row(int n_lights, int n_lights_on) {
    assert n_lights >= n_lights_on;

    int n_lights_off = n_lights - n_lights_on;

    return repeat('1', n_lights_on) + repeat('0', n_lights_off);
  }

  private static String repeat(char c, int n) {
    assert n >= 0;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i += 1) {
      sb.append(c);
    }

    return sb.toString();
  }
}
