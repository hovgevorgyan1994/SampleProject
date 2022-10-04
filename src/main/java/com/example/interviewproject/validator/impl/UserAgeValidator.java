package com.example.interviewproject.validator.impl;

import com.example.interviewproject.dto.UserRegistrationDto;
import com.example.interviewproject.exception.Error;
import com.example.interviewproject.exception.RegistrationException;
import com.example.interviewproject.validator.UserRegistrationValidator;
import java.time.LocalDate;
import org.springframework.stereotype.Component;

/**
 * @author Hovhannes Gevorgyan on 22.09.2022
 */

@Component
public class UserAgeValidator implements UserRegistrationValidator {

  @Override
  public void validate(UserRegistrationDto dto) {
    int age = LocalDate.now().getYear() - dto.getBirthDate().getYear();
    if (age < 15) {
      throw new RegistrationException(Error.UNACCEPTABLE_AGE);
    }
  }
}
