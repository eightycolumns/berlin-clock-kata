package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void fiveHourRowExpectsNonnegativeHour() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(-1);
  }

  @Test
  public void fiveHourRowIs0000AtHour0() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(0);
    assertEquals("0000", fiveHourRow.toBinaryString());
  }

  @Test
  public void fiveHourRowIs0000AtHour4() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(4);
    assertEquals("0000", fiveHourRow.toBinaryString());
  }

  @Test
  public void fiveHourRowIs1000AtHour5() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(5);
    assertEquals("1000", fiveHourRow.toBinaryString());
  }

  @Test
  public void fiveHourRowIs1000AtHour9() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(9);
    assertEquals("1000", fiveHourRow.toBinaryString());
  }

  @Test
  public void fiveHourRowIs1100AtHour10() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(10);
    assertEquals("1100", fiveHourRow.toBinaryString());
  }

  @Test
  public void fiveHourRowIs1111AtHour23() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(23);
    assertEquals("1111", fiveHourRow.toBinaryString());
  }

  @Test(expected = InvalidHourException.class)
  public void fiveHourRowExpectsHourLessThan24() {
    FiveHourRow fiveHourRow = FiveHourRow.atHour(24);
  }
}
