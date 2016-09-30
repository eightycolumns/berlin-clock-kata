package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {
  @Test
  public void secondsLampIs1AtSecond0() {
    assertEquals("1", BerlinClock.secondsLamp(0));
  }
}
