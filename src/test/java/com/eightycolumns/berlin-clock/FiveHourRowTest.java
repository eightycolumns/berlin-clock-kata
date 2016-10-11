package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void fiveHourRowExpectsNonnegativeHour() {
    FiveHourRow.atHour(-1);
  }

  @Test
  public void fiveHourRowIs0000AtHour0() {
    assertEquals("0000", FiveHourRow.atHour(0));
  }

  @Test
  public void fiveHourRowIs0000AtHour4() {
    assertEquals("0000", FiveHourRow.atHour(4));
  }

  @Test
  public void fiveHourRowIs1000AtHour5() {
    assertEquals("1000", FiveHourRow.atHour(5));
  }

  @Test
  public void fiveHourRowIs1000AtHour9() {
    assertEquals("1000", FiveHourRow.atHour(9));
  }

  @Test
  public void fiveHourRowIs1100AtHour10() {
    assertEquals("1100", FiveHourRow.atHour(10));
  }

  @Test
  public void fiveHourRowIs1111AtHour23() {
    assertEquals("1111", FiveHourRow.atHour(23));
  }

  @Test(expected = InvalidHourException.class)
  public void fiveHourRowExpectsHourLessThan24() {
    FiveHourRow.atHour(24);
  }
}
