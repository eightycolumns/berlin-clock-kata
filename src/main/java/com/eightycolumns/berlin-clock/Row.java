package com.eightycolumns.berlin_clock;

abstract class Row {
  abstract String toBinaryString();

  protected String row(int nLights, int nLightsOn) {
    assert nLights >= nLightsOn;

    int nLightsOff = nLights - nLightsOn;

    return repeat('1', nLightsOn) + repeat('0', nLightsOff);
  }

  protected String repeat(char c, int n) {
    assert n >= 0;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i += 1) {
      sb.append(c);
    }

    return sb.toString();
  }
}
