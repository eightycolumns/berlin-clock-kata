package com.eightycolumns.berlin_clock;

class BerlinClock {
  public String compositeRow(int hour, int minute, int second) {
    String secondsLamp = new SecondsLamp(second).binaryString();
    String fiveHourRow = new FiveHourRow(hour).binaryString();

    return (
      secondsLamp +
      fiveHourRow +
      OneHourRow.atHour(hour) +
      FiveMinuteRow.atMinute(minute) +
      OneMinuteRow.atMinute(minute)
    );
  }
}
