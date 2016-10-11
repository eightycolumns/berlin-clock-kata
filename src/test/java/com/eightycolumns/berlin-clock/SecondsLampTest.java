package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondsLampTest {
  @Test(expected = InvalidSecondException.class)
  public void secondsLampExpectsNonnegativeSecond() {
    SecondsLamp secondsLamp = SecondsLamp.atSecond(-1);
  }

  @Test
  public void secondsLampIs1AtSecond0() {
    SecondsLamp secondsLamp = SecondsLamp.atSecond(0);
    assertEquals("1", secondsLamp.toBinaryString());
  }

  @Test
  public void secondsLampIs0AtSecond59() {
    SecondsLamp secondsLamp = SecondsLamp.atSecond(59);
    assertEquals("0", secondsLamp.toBinaryString());
  }

  @Test(expected = InvalidSecondException.class)
  public void secondsLampExpectsSecondLessThan60() {
    SecondsLamp secondsLamp = SecondsLamp.atSecond(60);
  }
}
