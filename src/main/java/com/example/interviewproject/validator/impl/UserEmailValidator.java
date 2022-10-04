package com.example.interviewproject.validator.impl;

import com.example.interviewproject.dto.UserRegistrationDto;
import com.example.interviewproject.exception.Error;
import com.example.interviewproject.exception.RegistrationException;
import com.example.interviewproject.repository.UserRepository;
import com.example.interviewproject.validator.UserRegistrationValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEmailValidator implements UserRegistrationValidator {

  private final UserRepository userRepository;

  @Override
  public void validate(UserRegistrationDto dto) {
    if (userRepository.existsByEmailIgnoreCase(dto.getEmail())) {
      throw new RegistrationException(Error.EMAIL_ALREADY_EXISTS);
    }
  }
}
