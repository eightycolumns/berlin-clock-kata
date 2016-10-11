package com.eightycolumns.berlin_clock;

public final class BerlinClockTime {
  private final SecondsLamp secondsLamp;
  private final FiveHourRow fiveHourRow;
  private final OneHourRow oneHourRow;
  private final FiveMinuteRow fiveMinuteRow;
  private final OneMinuteRow oneMinuteRow;

  public BerlinClockTime(int hour, int minute, int second) {
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
