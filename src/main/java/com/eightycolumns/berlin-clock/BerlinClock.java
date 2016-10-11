package com.eightycolumns.berlin_clock;

class BerlinClock {
  public String compositeRow(int hour, int minute, int second) {
    SecondsLamp secondsLamp = new SecondsLamp(second);
    FiveHourRow fiveHourRow = new FiveHourRow(hour);
    OneHourRow oneHourRow = new OneHourRow(hour);
    FiveMinuteRow fiveMinuteRow = new FiveMinuteRow(minute);
    OneMinuteRow oneMinuteRow = new OneMinuteRow(minute);

    return (
      secondsLamp.toBinaryString() +
      fiveHourRow.toBinaryString() +
      oneHourRow.toBinaryString() +
      fiveMinuteRow.toBinaryString() +
      oneMinuteRow.toBinaryString()
    );
  }
}
