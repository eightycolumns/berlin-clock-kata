package com.eightycolumns.berlin_clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondsLampTest {
  @Test(expected = InvalidSecondException.class)
  public void secondsLampExpectsNonnegativeSecond() {
    SecondsLamp secondsLamp = new SecondsLamp(-1);
  }

  @Test
  public void secondsLampIs1AtSecond0() {
    SecondsLamp secondsLamp = new SecondsLamp(0);
    assertEquals("1", secondsLamp.binaryString());
  }

  @Test
  public void secondsLampIs0AtSecond59() {
    SecondsLamp secondsLamp = new SecondsLamp(59);
    assertEquals("0", secondsLamp.binaryString());
  }

  @Test(expected = InvalidSecondException.class)
  public void secondsLampExpectsSecondLessThan60() {
    SecondsLamp secondsLamp = new SecondsLamp(60);
  }
}
