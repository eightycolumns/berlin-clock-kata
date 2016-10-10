package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

public class BerlinClockTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

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
