package com.eightycolumns.berlin_clock;

class BerlinClockTime {
  private SecondsLamp secondsLamp;
  private FiveHourRow fiveHourRow;
  private OneHourRow oneHourRow;
  private FiveMinuteRow fiveMinuteRow;
  private OneMinuteRow oneMinuteRow;

  BerlinClockTime(int hour, int minute, int second) {
    secondsLamp = new SecondsLamp(second);
    fiveHourRow = new FiveHourRow(hour);
    oneHourRow = new OneHourRow(hour);
    fiveMinuteRow = new FiveMinuteRow(minute);
    oneMinuteRow = new OneMinuteRow(minute);
  }

  public String toBinaryString() {
    return (
      secondsLamp.toBinaryString() +
      fiveHourRow.toBinaryString() +
      oneHourRow.toBinaryString() +
      fiveMinuteRow.toBinaryString() +
      oneMinuteRow.toBinaryString()
    );
  }
}
