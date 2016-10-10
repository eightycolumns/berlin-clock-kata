package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

public class FiveMinuteRowTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void fiveMinuteRowExpectsNonnegativeMinute() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid minute");
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

  @Test
  public void fiveMinuteRowExpectsMinuteLessThan60() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid minute");
    BerlinClock.fiveMinuteRow(60);
  }
}
