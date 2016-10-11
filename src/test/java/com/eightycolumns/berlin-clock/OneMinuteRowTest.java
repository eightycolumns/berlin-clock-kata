package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneMinuteRowTest {
  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsNonnegativeMinute() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(-1);
  }

  @Test
  public void oneMinuteRowIs0000AtMinute0() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(0);
    assertEquals("0000", oneMinuteRow.binaryString());
  }

  @Test
  public void oneMinuteRowIs1000AtMinute1() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(1);
    assertEquals("1000", oneMinuteRow.binaryString());
  }

  @Test
  public void oneMinuteRowIs1111AtMinute4() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(4);
    assertEquals("1111", oneMinuteRow.binaryString());
  }

  @Test
  public void oneMinuteRowIs0000AtMinute5() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(5);
    assertEquals("0000", oneMinuteRow.binaryString());
  }

  @Test
  public void oneMinuteRowIs1000AtMinute6() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(6);
    assertEquals("1000", oneMinuteRow.binaryString());
  }

  @Test
  public void oneMinuteRowIs1111AtMinute59() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(59);
    assertEquals("1111", oneMinuteRow.binaryString());
  }

  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsMinuteLessThan60() {
    OneMinuteRow oneMinuteRow = new OneMinuteRow(60);
  }
}
