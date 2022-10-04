package com.example.interviewproject.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author Hovhannes Gevorgyan on 22.09.2022
 */
@Getter
@RequiredArgsConstructor
public enum Error {
  UNACCEPTABLE_AGE(4000, HttpStatus.BAD_REQUEST, "User cannot be younger than 15 years"),
  USER_NOT_FOUND(4040, HttpStatus.NOT_FOUND, "There is not user with such email"),
  EMAIL_ALREADY_EXISTS(4001, HttpStatus.BAD_REQUEST, "Email already exists");

  private final Integer code;
  private final HttpStatus status;
  private final String message;
}
