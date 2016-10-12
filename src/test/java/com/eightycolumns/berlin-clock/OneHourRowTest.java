package com.eightycolumns.berlin_clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OneHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsNonnegativeHour() {
    OneHourRow oneHourRow = OneHourRow.atHour(-1);
  }

  @Test
  public void oneHourRowIs0000AtHour0() {
    assertEquals("0000", OneHourRow.atHour(0).toBinaryString());
  }

  @Test
  public void oneHourRowIs1000AtHour1() {
    assertEquals("1000", OneHourRow.atHour(1).toBinaryString());
  }

  @Test
  public void oneHourRowIs1100AtHour4() {
    assertEquals("1111", OneHourRow.atHour(4).toBinaryString());
  }

  @Test
  public void oneHourRowIs0000AtHour5() {
    assertEquals("0000", OneHourRow.atHour(5).toBinaryString());
  }

  @Test
  public void oneHourRowIs1000AtHour6() {
    assertEquals("1000", OneHourRow.atHour(6).toBinaryString());
  }

  @Test
  public void oneHourRowIs1110AtHour23() {
    assertEquals("1110", OneHourRow.atHour(23).toBinaryString());
  }

  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsHourLessThan24() {
    OneHourRow oneHourRow = OneHourRow.atHour(24);
  }
}
