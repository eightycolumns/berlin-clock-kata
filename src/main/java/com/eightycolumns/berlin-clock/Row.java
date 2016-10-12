package com.eightycolumns.berlin_clock;

abstract class Row {
  abstract String toBinaryString();

  protected String repeat(char c, int n) {
    assert n >= 0;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i += 1) {
      sb.append(c);
    }

    return sb.toString();
  }
}
