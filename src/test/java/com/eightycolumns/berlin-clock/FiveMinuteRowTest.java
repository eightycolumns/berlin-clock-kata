package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveMinuteRowTest {
  @Test(expected = InvalidMinuteException.class)
  public void fiveMinuteRowExpectsNonnegativeMinute() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(-1);
  }

  @Test
  public void fiveMinuteRowIs00000000000AtMinute0() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(0);
    assertEquals("00000000000", fiveMinuteRow.toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs00000000000AtMinute4() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(4);
    assertEquals("00000000000", fiveMinuteRow.toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute5() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(5);
    assertEquals("10000000000", fiveMinuteRow.toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute9() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(9);
    assertEquals("10000000000", fiveMinuteRow.toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs11000000000AtMinute10() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(10);
    assertEquals("11000000000", fiveMinuteRow.toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs11111111111AtMinute59() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(59);
    assertEquals("11111111111", fiveMinuteRow.toBinaryString());
  }

  @Test(expected = InvalidMinuteException.class)
  public void fiveMinuteRowExpectsMinuteLessThan60() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(60);
  }
}
