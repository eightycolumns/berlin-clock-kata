package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
  @Test
  public void secondsLampIs1AtSecond0() {
    assertEquals("1", BerlinClock.secondsLamp(0));
  }

  @Test
  public void secondsLampIs0AtSecond59() {
    assertEquals("0", BerlinClock.secondsLamp(59));
  }

  @Test
  public void fiveHourRowIs0000AtHour0() {
    assertEquals("0000", BerlinClock.fiveHourRow(0));
  }
}
