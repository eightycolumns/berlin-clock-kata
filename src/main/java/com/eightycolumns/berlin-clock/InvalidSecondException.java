package com.eightycolumns.berlin_clock;

class InvalidSecondException extends IllegalArgumentException {
  @Override
  public String toString() {
    return "InvalidSecondException: Second must be between 0 and 59 inclusive";
  }
}
