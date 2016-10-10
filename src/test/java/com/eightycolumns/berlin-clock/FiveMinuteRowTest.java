package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveMinuteRowTest {
  @Test(expected = IllegalArgumentException.class)
  public void fiveMinuteRowExpectsNonnegativeMinute() {
    BerlinClock.fiveMinuteRow(-1);
  }

  @Test
  public void fiveMinuteRowIs00000000000AtMinute0() {
    assertEquals("00000000000", BerlinClock.fiveMinuteRow(0));
  }

  @Test
  public void fiveMinuteRowIs00000000000AtMinute4() {
    assertEquals("00000000000", BerlinClock.fiveMinuteRow(4));
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute5() {
    assertEquals("10000000000", BerlinClock.fiveMinuteRow(5));
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute9() {
    assertEquals("10000000000", BerlinClock.fiveMinuteRow(9));
  }

  @Test
  public void fiveMinuteRowIs11000000000AtMinute10() {
    assertEquals("11000000000", BerlinClock.fiveMinuteRow(10));
  }

  @Test
  public void fiveMinuteRowIs11111111111AtMinute59() {
    assertEquals("11111111111", BerlinClock.fiveMinuteRow(59));
  }

  @Test(expected = IllegalArgumentException.class)
  public void fiveMinuteRowExpectsMinuteLessThan60() {
    BerlinClock.fiveMinuteRow(60);
  }
}
