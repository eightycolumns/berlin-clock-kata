package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneMinuteRowTest {
  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsNonnegativeMinute() {
    BerlinClock.oneMinuteRow(-1);
  }

  @Test
  public void oneMinuteRowIs0000AtMinute0() {
    assertEquals("0000", BerlinClock.oneMinuteRow(0));
  }

  @Test
  public void oneMinuteRowIs1000AtMinute1() {
    assertEquals("1000", BerlinClock.oneMinuteRow(1));
  }

  @Test
  public void oneMinuteRowIs1111AtMinute4() {
    assertEquals("1111", BerlinClock.oneMinuteRow(4));
  }

  @Test
  public void oneMinuteRowIs0000AtMinute5() {
    assertEquals("0000", BerlinClock.oneMinuteRow(5));
  }

  @Test
  public void oneMinuteRowIs1000AtMinute6() {
    assertEquals("1000", BerlinClock.oneMinuteRow(6));
  }

  @Test
  public void oneMinuteRowIs1111AtMinute59() {
    assertEquals("1111", BerlinClock.oneMinuteRow(59));
  }

  @Test(expected = InvalidMinuteException.class)
  public void oneMinuteRowExpectsMinuteLessThan60() {
    BerlinClock.oneMinuteRow(60);
  }
}
