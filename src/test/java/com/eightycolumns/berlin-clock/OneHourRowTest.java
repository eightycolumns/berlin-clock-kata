package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneHourRowTest {
  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsNonnegativeHour() {
    OneHourRow oneHourRow = new OneHourRow(-1);
  }

  @Test
  public void oneHourRowIs0000AtHour0() {
    OneHourRow oneHourRow = new OneHourRow(0);
    assertEquals("0000", oneHourRow.toBinaryString());
  }

  @Test
  public void oneHourRowIs1000AtHour1() {
    OneHourRow oneHourRow = new OneHourRow(1);
    assertEquals("1000", oneHourRow.toBinaryString());
  }

  @Test
  public void oneHourRowIs1100AtHour4() {
    OneHourRow oneHourRow = new OneHourRow(4);
    assertEquals("1111", oneHourRow.toBinaryString());
  }

  @Test
  public void oneHourRowIs0000AtHour5() {
    OneHourRow oneHourRow = new OneHourRow(5);
    assertEquals("0000", oneHourRow.toBinaryString());
  }

  @Test
  public void oneHourRowIs1000AtHour6() {
    OneHourRow oneHourRow = new OneHourRow(6);
    assertEquals("1000", oneHourRow.toBinaryString());
  }

  @Test
  public void oneHourRowIs1110AtHour23() {
    OneHourRow oneHourRow = new OneHourRow(23);
    assertEquals("1110", oneHourRow.toBinaryString());
  }

  @Test(expected = InvalidHourException.class)
  public void oneHourRowExpectsHourLessThan24() {
    OneHourRow oneHourRow = new OneHourRow(24);
  }
}
