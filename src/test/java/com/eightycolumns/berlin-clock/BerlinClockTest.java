package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

public class BerlinClockTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  // One-minute row

  @Test
  public void oneMinuteRowExpectsNonnegativeMinute() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid minute");
    BerlinClock.oneMinuteRow(-1);
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
  public void oneMinuteRowExpectsMinuteLessThan60() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid minute");
    BerlinClock.oneMinuteRow(60);
  }

  // Composite row

  @Test
  public void compositeRowExpectsNonnegativeHour() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid hour");
    BerlinClock.compositeRow(-1, 0, 0);
  }

  @Test
  public void compositeRowExpectsNonnegativeMinute() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid minute");
    BerlinClock.compositeRow(0, -1, 0);
  }

  @Test
  public void compositeRowExpectsNonnegativeSecond() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid second");
    BerlinClock.compositeRow(0, 0, -1);
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

  @Test
  public void compositeRowExpectsHourLessThan24() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid hour");
    BerlinClock.compositeRow(24, 0, 0);
  }

  @Test
  public void compositeRowExpectsMinuteLessThan60() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid minute");
    BerlinClock.compositeRow(0, 60, 0);
  }

  @Test
  public void compositeRowExpectsSecondLessThan60() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid second");
    BerlinClock.compositeRow(0, 0, 60);
  }
}
