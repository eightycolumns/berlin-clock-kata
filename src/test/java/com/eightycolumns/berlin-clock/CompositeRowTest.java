package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompositeRowTest {
  @Test(expected = InvalidHourException.class)
  public void compositeRowExpectsNonnegativeHour() {
    BerlinClock berlinClock = new BerlinClock();
    berlinClock.compositeRow(-1, 0, 0);
  }

  @Test(expected = InvalidMinuteException.class)
  public void compositeRowExpectsNonnegativeMinute() {
    BerlinClock berlinClock = new BerlinClock();
    berlinClock.compositeRow(0, -1, 0);
  }

  @Test(expected = InvalidSecondException.class)
  public void compositeRowExpectsNonnegativeSecond() {
    BerlinClock berlinClock = new BerlinClock();
    berlinClock.compositeRow(0, 0, -1);
  }

  @Test
  public void compositeRowIs100000000000000000000000AtHour0Minute0Second0() {
    BerlinClock berlinClock = new BerlinClock();

    assertEquals(
      "100000000000000000000000",
      berlinClock.compositeRow(0, 0, 0)
    );
  }

  @Test
  public void compositeRowIs011111110111111111111111AtHour23Minute59Second59() {
    BerlinClock berlinClock = new BerlinClock();

    assertEquals(
      "011111110111111111111111",
      berlinClock.compositeRow(23, 59, 59)
    );
  }

  @Test(expected = InvalidHourException.class)
  public void compositeRowExpectsHourLessThan24() {
    BerlinClock berlinClock = new BerlinClock();
    berlinClock.compositeRow(24, 0, 0);
  }

  @Test(expected = InvalidMinuteException.class)
  public void compositeRowExpectsMinuteLessThan60() {
    BerlinClock berlinClock = new BerlinClock();
    berlinClock.compositeRow(0, 60, 0);
  }

  @Test(expected = InvalidSecondException.class)
  public void compositeRowExpectsSecondLessThan60() {
    BerlinClock berlinClock = new BerlinClock();
    berlinClock.compositeRow(0, 0, 60);
  }
}
