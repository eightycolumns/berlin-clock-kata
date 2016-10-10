package com.eightycolumns.berlin_clock;

class InvalidMinuteException extends IllegalArgumentException {
  @Override
  public String toString() {
    return "InvalidMinuteException: Minute must be between 0 and 59 inclusive";
  }
}
