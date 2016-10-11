package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneMinuteRowTest {
  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsNonnegativeMinute() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(-1);
  }

  @Test
  public void oneMinuteRowIs0000AtMinute0() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(0);
    assertEquals("0000", oneMinuteRow.toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1000AtMinute1() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(1);
    assertEquals("1000", oneMinuteRow.toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1111AtMinute4() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(4);
    assertEquals("1111", oneMinuteRow.toBinaryString());
  }

  @Test
  public void oneMinuteRowIs0000AtMinute5() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(5);
    assertEquals("0000", oneMinuteRow.toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1000AtMinute6() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(6);
    assertEquals("1000", oneMinuteRow.toBinaryString());
  }

  @Test
  public void oneMinuteRowIs1111AtMinute59() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(59);
    assertEquals("1111", oneMinuteRow.toBinaryString());
  }

  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsMinuteLessThan60() {
    OneMinuteRow oneMinuteRow = OneMinuteRow.atMinute(60);
  }
}
