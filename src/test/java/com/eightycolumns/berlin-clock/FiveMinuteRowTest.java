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
    assertEquals("00000000000", FiveMinuteRow.atMinute(0).toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs00000000000AtMinute4() {
    assertEquals("00000000000", FiveMinuteRow.atMinute(4).toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute5() {
    assertEquals("10000000000", FiveMinuteRow.atMinute(5).toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute9() {
    assertEquals("10000000000", FiveMinuteRow.atMinute(9).toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs11000000000AtMinute10() {
    assertEquals("11000000000", FiveMinuteRow.atMinute(10).toBinaryString());
  }

  @Test
  public void fiveMinuteRowIs11111111111AtMinute59() {
    assertEquals("11111111111", FiveMinuteRow.atMinute(59).toBinaryString());
  }

  @Test(expected = InvalidMinuteException.class)
  public void fiveMinuteRowExpectsMinuteLessThan60() {
    FiveMinuteRow fiveMinuteRow = FiveMinuteRow.atMinute(60);
  }
}
