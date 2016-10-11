package com.eightycolumns.berlin_clock;

class BerlinClock {
  public String compositeRow(int hour, int minute, int second) {
    return (
      SecondsLamp.atSecond(second) +
      FiveHourRow.atHour(hour) +
      OneHourRow.atHour(hour) +
      FiveMinuteRow.atMinute(minute) +
      OneMinuteRow.atMinute(minute)
    );
  }
}
