package com.example.interviewproject.exception;

/**
 * @author Hovhannes Gevorgyan on 22.09.2022
 */
public class UserNotFoundException extends BaseException{

  public UserNotFoundException(Error error) {
    super(error);
  }
}
