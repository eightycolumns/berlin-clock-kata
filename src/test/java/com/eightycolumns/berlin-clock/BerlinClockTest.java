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

  @Test
  public void fiveMinuteRowIs00000000000AtMinute0() {
    assertEquals("00000000000", BerlinClock.fiveMinuteRow(0));
  }
}
