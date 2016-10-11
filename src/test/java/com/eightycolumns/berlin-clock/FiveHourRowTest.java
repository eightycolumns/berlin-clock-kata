package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void fiveHourRowExpectsNonnegativeHour() {
    FiveHourRow fiveHourRow = new FiveHourRow(-1);
  }

  @Test
  public void fiveHourRowIs0000AtHour0() {
    FiveHourRow fiveHourRow = new FiveHourRow(0);
    assertEquals("0000", fiveHourRow.binaryString());
  }

  @Test
  public void fiveHourRowIs0000AtHour4() {
    FiveHourRow fiveHourRow = new FiveHourRow(4);
    assertEquals("0000", fiveHourRow.binaryString());
  }

  @Test
  public void fiveHourRowIs1000AtHour5() {
    FiveHourRow fiveHourRow = new FiveHourRow(5);
    assertEquals("1000", fiveHourRow.binaryString());
  }

  @Test
  public void fiveHourRowIs1000AtHour9() {
    FiveHourRow fiveHourRow = new FiveHourRow(9);
    assertEquals("1000", fiveHourRow.binaryString());
  }

  @Test
  public void fiveHourRowIs1100AtHour10() {
    FiveHourRow fiveHourRow = new FiveHourRow(10);
    assertEquals("1100", fiveHourRow.binaryString());
  }

  @Test
  public void fiveHourRowIs1111AtHour23() {
    FiveHourRow fiveHourRow = new FiveHourRow(23);
    assertEquals("1111", fiveHourRow.binaryString());
  }

  @Test(expected = InvalidHourException.class)
  public void fiveHourRowExpectsHourLessThan24() {
    FiveHourRow fiveHourRow = new FiveHourRow(24);
  }
}
