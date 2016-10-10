package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsNonnegativeHour() {
    BerlinClock.oneHourRow(-1);
  }

  @Test
  public void oneHourRowIs0000AtHour0() {
    assertEquals("0000", BerlinClock.oneHourRow(0));
  }

  @Test
  public void oneHourRowIs1000AtHour1() {
    assertEquals("1000", BerlinClock.oneHourRow(1));
  }

  @Test
  public void oneHourRowIs1100AtHour4() {
    assertEquals("1111", BerlinClock.oneHourRow(4));
  }

  @Test
  public void oneHourRowIs0000AtHour5() {
    assertEquals("0000", BerlinClock.oneHourRow(5));
  }

  @Test
  public void oneHourRowIs1000AtHour6() {
    assertEquals("1000", BerlinClock.oneHourRow(6));
  }

  @Test
  public void oneHourRowIs1110AtHour23() {
    assertEquals("1110", BerlinClock.oneHourRow(23));
  }

  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsHourLessThan24() {
    BerlinClock.oneHourRow(24);
  }
}
