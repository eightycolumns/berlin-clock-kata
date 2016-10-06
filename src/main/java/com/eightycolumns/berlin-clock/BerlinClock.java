package com.eightycolumns.berlin_clock;

class BerlinClock {
  private BerlinClock() {
    // Suppress default constructor
  }

  public static String compositeRow(int hour, int minute, int second) {
    return (
      secondsLamp(second) +
      fiveHourRow(hour) +
      oneHourRow(hour) +
      fiveMinuteRow(minute) +
      oneMinuteRow(minute)
    );
  }

  static String secondsLamp(int second) {
    if (second < 0 || second > 59) {
      throw new IllegalArgumentException("Invalid second");
    }

    return isEven(second) ? "1" : "0";
  }

  static String fiveHourRow(int hour) {
    if (hour < 0 || hour > 23) {
      throw new IllegalArgumentException("Invalid hour");
    }

    int n_lights = 4;
    int n_lights_on = hour / 5;

    return row(n_lights, n_lights_on);
  }

  static String oneHourRow(int hour) {
    if (hour < 0 || hour > 23) {
      throw new IllegalArgumentException("Invalid hour");
    }

    int n_lights = 4;
    int n_lights_on = hour % 5;

    return row(n_lights, n_lights_on);
  }

  static String fiveMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new IllegalArgumentException("Invalid minute");
    }

    int n_lights = 11;
    int n_lights_on = minute / 5;

    return row(n_lights, n_lights_on);
  }

  static String oneMinuteRow(int minute) {
    if (minute < 0 || minute > 59) {
      throw new IllegalArgumentException("Invalid minute");
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

    String s = "";

    for (int i = 0; i < n; i += 1) {
      s += c;
    }

    return s;
  }
}
