package com.eightycolumns.berlin_clock;

import java.time.LocalTime;

public final class BerlinClockTime {
  private final SecondsLamp secondsLamp;
  private final FiveHourRow fiveHourRow;
  private final OneHourRow oneHourRow;
  private final FiveMinuteRow fiveMinuteRow;
  private final OneMinuteRow oneMinuteRow;

  private BerlinClockTime(int hour, int minute, int second) {
    secondsLamp = SecondsLamp.atSecond(second);
    fiveHourRow = FiveHourRow.atHour(hour);
    oneHourRow = OneHourRow.atHour(hour);
    fiveMinuteRow = FiveMinuteRow.atMinute(minute);
    oneMinuteRow = OneMinuteRow.atMinute(minute);
  }

  public static BerlinClockTime atHourMinSec(int hour, int minute, int second) {
    return new BerlinClockTime(hour, minute, second);
  }

  public static BerlinClockTime atLocalTime(LocalTime localTime) {
    int hour = localTime.getHour();
    int minute = localTime.getMinute();
    int second = localTime.getSecond();

    return new BerlinClockTime(hour, minute, second);
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
