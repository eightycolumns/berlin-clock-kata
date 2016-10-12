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
    StringBuilder sb = new StringBuilder();

    sb.append(secondsLamp.toBinaryString());
    sb.append(fiveHourRow.toBinaryString());
    sb.append(oneHourRow.toBinaryString());
    sb.append(fiveMinuteRow.toBinaryString());
    sb.append(oneMinuteRow.toBinaryString());

    return sb.toString();
  }
}
