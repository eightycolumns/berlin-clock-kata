package com.eightycolumns.berlin_clock;

public final class BerlinClockTime {
  private final SecondsLamp secondsLamp;
  private final FiveHourRow fiveHourRow;
  private final OneHourRow oneHourRow;
  private final FiveMinuteRow fiveMinuteRow;
  private final OneMinuteRow oneMinuteRow;

  public BerlinClockTime(int hour, int minute, int second) {
    secondsLamp = SecondsLamp.atSecond(second);
    fiveHourRow = FiveHourRow.atHour(hour);
    oneHourRow = OneHourRow.atHour(hour);
    fiveMinuteRow = FiveMinuteRow.atMinute(minute);
    oneMinuteRow = OneMinuteRow.atMinute(minute);
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
