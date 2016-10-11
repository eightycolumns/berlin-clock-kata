package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsNonnegativeHour() {
    OneHourRow.atHour(-1);
  }

  @Test
  public void oneHourRowIs0000AtHour0() {
    assertEquals("0000", OneHourRow.atHour(0));
  }

  @Test
  public void oneHourRowIs1000AtHour1() {
    assertEquals("1000", OneHourRow.atHour(1));
  }

  @Test
  public void oneHourRowIs1100AtHour4() {
    assertEquals("1111", OneHourRow.atHour(4));
  }

  @Test
  public void oneHourRowIs0000AtHour5() {
    assertEquals("0000", OneHourRow.atHour(5));
  }

  @Test
  public void oneHourRowIs1000AtHour6() {
    assertEquals("1000", OneHourRow.atHour(6));
  }

  @Test
  public void oneHourRowIs1110AtHour23() {
    assertEquals("1110", OneHourRow.atHour(23));
  }

  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsHourLessThan24() {
    OneHourRow.atHour(24);
  }
}
