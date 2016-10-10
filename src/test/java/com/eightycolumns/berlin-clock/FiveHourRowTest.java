package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveHourRowTest {
  @Test(expected = IllegalArgumentException.class)
  public void fiveHourRowExpectsNonnegativeHour() {
    BerlinClock.fiveHourRow(-1);
  }

  @Test
  public void fiveHourRowIs0000AtHour0() {
    assertEquals("0000", BerlinClock.fiveHourRow(0));
  }

  @Test
  public void fiveHourRowIs0000AtHour4() {
    assertEquals("0000", BerlinClock.fiveHourRow(4));
  }

  @Test
  public void fiveHourRowIs1000AtHour5() {
    assertEquals("1000", BerlinClock.fiveHourRow(5));
  }

  @Test
  public void fiveHourRowIs1000AtHour9() {
    assertEquals("1000", BerlinClock.fiveHourRow(9));
  }

  @Test
  public void fiveHourRowIs1100AtHour10() {
    assertEquals("1100", BerlinClock.fiveHourRow(10));
  }

  @Test
  public void fiveHourRowIs1111AtHour23() {
    assertEquals("1111", BerlinClock.fiveHourRow(23));
  }

  @Test(expected = IllegalArgumentException.class)
  public void fiveHourRowExpectsHourLessThan24() {
    BerlinClock.fiveHourRow(24);
  }
}
