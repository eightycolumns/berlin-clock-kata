package com.eightycolumns.berlin_clock;

class BerlinClock {
  private BerlinClock() {
    // Suppress default constructor
  }

  public static String compositeRow(int hour, int minute, int second) {
    return (
      SecondsLamp.atSecond(second) +
      FiveHourRow.atHour(hour) +
      OneHourRow.atHour(hour) +
      fiveMinuteRow(minute) +
      oneMinuteRow(minute)
    );
  }

  static String fiveMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new InvalidMinuteException();
    }

    int n_lights = 11;
    int n_lights_on = minute / 5;

    return row(n_lights, n_lights_on);
  }

  static String oneMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new InvalidMinuteException();
    }

    int n_lights = 4;
    int n_lights_on = minute % 5;

    return row(n_lights, n_lights_on);
  }

  private static boolean isEven(int d) {
    return d % 2 == 0;
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
