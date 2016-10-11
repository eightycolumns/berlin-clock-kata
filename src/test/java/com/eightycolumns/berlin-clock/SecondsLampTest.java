package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondsLampTest {
  @Test(expected = InvalidSecondException.class)
  public void secondsLampExpectsNonnegativeSecond() {
    SecondsLamp.atSecond(-1);
  }

  @Test
  public void secondsLampIs1AtSecond0() {
    assertEquals("1", SecondsLamp.atSecond(0));
  }

  @Test
  public void secondsLampIs0AtSecond59() {
    assertEquals("0", SecondsLamp.atSecond(59));
  }

  @Test(expected = InvalidSecondException.class)
  public void secondsLampExpectsSecondLessThan60() {
    SecondsLamp.atSecond(60);
  }
}
