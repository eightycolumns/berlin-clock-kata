package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

public class SecondsLampTest {
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
  public void secondsLampExpectsSecondLessThan60() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Invalid second");
    BerlinClock.secondsLamp(60);
  }
}
