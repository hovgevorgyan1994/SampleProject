package com.example.interviewproject.exception;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {

  private final Error error;

  public BaseException(Error error) {
    this.error = error;
  }
}
