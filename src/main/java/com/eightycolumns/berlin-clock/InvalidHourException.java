package com.eightycolumns.berlin_clock;

class InvalidHourException extends IllegalArgumentException {
  @Override
  public String toString() {
    return "InvalidHourException: Hour must be between 0 and 23 inclusive";
  }
}
