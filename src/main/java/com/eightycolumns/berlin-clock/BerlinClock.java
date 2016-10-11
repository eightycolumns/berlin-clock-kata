package com.eightycolumns.berlin_clock;

class BerlinClock {
  public String compositeRow(int hour, int minute, int second) {
    String secondsLamp = new SecondsLamp(second).binaryString();
    String fiveHourRow = new FiveHourRow(hour).binaryString();
    String oneHourRow = new OneHourRow(hour).binaryString();
    String fiveMinuteRow = new FiveMinuteRow(minute).binaryString();

    return (
      secondsLamp +
      fiveHourRow +
      oneHourRow +
      fiveMinuteRow +
      OneMinuteRow.atMinute(minute)
    );
  }
}
