package com.eightycolumns.berlin_clock;

class BerlinClock {
  private SecondsLamp secondsLamp;
  private FiveHourRow fiveHourRow;
  private OneHourRow oneHourRow;
  private FiveMinuteRow fiveMinuteRow;
  private OneMinuteRow oneMinuteRow;

  BerlinClock(int hour, int minute, int second) {
    secondsLamp = new SecondsLamp(second);
    fiveHourRow = new FiveHourRow(hour);
    oneHourRow = new OneHourRow(hour);
    fiveMinuteRow = new FiveMinuteRow(minute);
    oneMinuteRow = new OneMinuteRow(minute);
  }

  public String compositeRow() {
    return (
      secondsLamp.toBinaryString() +
      fiveHourRow.toBinaryString() +
      oneHourRow.toBinaryString() +
      fiveMinuteRow.toBinaryString() +
      oneMinuteRow.toBinaryString()
    );
  }
}
