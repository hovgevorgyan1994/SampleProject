package com.example.interviewproject.exception;

import lombok.Getter;

/**
 * @author Hovhannes Gevorgyan on 22.09.2022
 */
@Getter
public class RegistrationException extends BaseException {

  public RegistrationException(Error error) {
    super(error);
  }
}
