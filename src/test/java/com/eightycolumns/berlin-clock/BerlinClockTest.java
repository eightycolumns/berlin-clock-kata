package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

public class BerlinClockTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void secondsLampExpectsNonnegativeSecond() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid second");
    BerlinClock.secondsLamp(-1);
  }

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

  @Test
  public void fiveMinuteRowIs00000000000AtMinute4() {
    assertEquals("00000000000", BerlinClock.fiveMinuteRow(4));
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute5() {
    assertEquals("10000000000", BerlinClock.fiveMinuteRow(5));
  }

  @Test
  public void fiveMinuteRowIs10000000000AtMinute9() {
    assertEquals("10000000000", BerlinClock.fiveMinuteRow(9));
  }

  @Test
  public void fiveMinuteRowIs11000000000AtMinute10() {
    assertEquals("11000000000", BerlinClock.fiveMinuteRow(10));
  }

  @Test
  public void fiveMinuteRowIs11111111111AtMinute59() {
    assertEquals("11111111111", BerlinClock.fiveMinuteRow(59));
  }

  @Test
  public void oneMinuteRowIs0000AtMinute0() {
    assertEquals("0000", BerlinClock.oneMinuteRow(0));
  }

  @Test
  public void oneMinuteRowIs1000AtMinute1() {
    assertEquals("1000", BerlinClock.oneMinuteRow(1));
  }

  @Test
  public void oneMinuteRowIs1111AtMinute4() {
    assertEquals("1111", BerlinClock.oneMinuteRow(4));
  }

  @Test
  public void oneMinuteRowIs0000AtMinute5() {
    assertEquals("0000", BerlinClock.oneMinuteRow(5));
  }

  @Test
  public void oneMinuteRowIs1000AtMinute6() {
    assertEquals("1000", BerlinClock.oneMinuteRow(6));
  }

  @Test
  public void oneMinuteRowIs1111AtMinute59() {
    assertEquals("1111", BerlinClock.oneMinuteRow(59));
  }

  @Test
  public void compositeRowIs100000000000000000000000AtHour0Minute0Second0() {
    assertEquals(
      "100000000000000000000000",
      BerlinClock.compositeRow(0, 0, 0)
    );
  }

  @Test
  public void compositeRowIs011111110111111111111111AtHour23Minute59Second59() {
    assertEquals(
      "011111110111111111111111",
      BerlinClock.compositeRow(23, 59, 59)
    );
  }
}
