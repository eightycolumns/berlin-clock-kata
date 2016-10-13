package com.eightycolumns.berlin_clock;

import static org.junit.Assert.assertEquals;

import java.time.LocalTime;
import org.junit.Test;

public class BerlinClockTimeTest {
  @Test(expected = InvalidHourException.class)
  public void berlinClockTimeExpectsNonnegativeHour() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(-1, 0, 0);
  }

  @Test(expected = InvalidMinuteException.class)
  public void berlinClockTimeExpectsNonnegativeMinute() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(0, -1, 0);
  }

  @Test(expected = InvalidSecondException.class)
  public void berlinClockTimeExpectsNonnegativeSecond() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(0, 0, -1);
  }

  @Test
  public void berlinClockTimeIs100000000000000000000000AtHour0Min0Sec0() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(0, 0, 0);
    assertEquals("100000000000000000000000", berlinClockTime.toBinaryString());
  }

  @Test
  public void berlinClockTimeIs011111110111111111111111AtHour23Min59Sec59() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(23, 59, 59);
    assertEquals("011111110111111111111111", berlinClockTime.toBinaryString());
  }

  @Test
  public void berlinClockTimeIs100000000000000000000000AtStartOfDay() {
    LocalTime startOfDay = LocalTime.of(0, 0, 0);
    BerlinClockTime berlinClockTime = BerlinClockTime.atLocalTime(startOfDay);
    assertEquals("100000000000000000000000", berlinClockTime.toBinaryString());
  }

  @Test
  public void berlinClockTimeIs011111110111111111111111AtEndOfDay() {
    LocalTime endOfDay = LocalTime.of(23, 59, 59);
    BerlinClockTime berlinClockTime = BerlinClockTime.atLocalTime(endOfDay);
    assertEquals("011111110111111111111111", berlinClockTime.toBinaryString());
  }

  @Test(expected = InvalidHourException.class)
  public void berlinClockTimeExpectsHourLessThan24() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(24, 0, 0);
  }

  @Test(expected = InvalidMinuteException.class)
  public void berlinClockTimeExpectsMinuteLessThan60() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(0, 60, 0);
  }

  @Test(expected = InvalidSecondException.class)
  public void berlinClockTimeExpectsSecondLessThan60() {
    BerlinClockTime berlinClockTime = BerlinClockTime.atHourMinSec(0, 0, 60);
  }
}
