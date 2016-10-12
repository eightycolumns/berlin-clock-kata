package com.eightycolumns.berlin_clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OneMinuteRowTest {
  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsNonnegativeMinute() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(-1);
  }

  @Test
  public void oneMinuteRowIs0000AtMinute0() {
    assertEquals("0000", OneMinuteRow.atMinute(0).toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1000AtMinute1() {
    assertEquals("1000", OneMinuteRow.atMinute(1).toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1111AtMinute4() {
    assertEquals("1111", OneMinuteRow.atMinute(4).toBinaryString());
  }

  @Test
  public void oneMinuteRowIs0000AtMinute5() {
    assertEquals("0000", OneMinuteRow.atMinute(5).toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1000AtMinute6() {
    assertEquals("1000", OneMinuteRow.atMinute(6).toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1111AtMinute59() {
    assertEquals("1111", OneMinuteRow.atMinute(59).toBinaryString());
  }

  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsMinuteLessThan60() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(60);
  }
}
