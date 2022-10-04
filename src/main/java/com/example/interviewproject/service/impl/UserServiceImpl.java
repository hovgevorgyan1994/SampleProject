package com.example.interviewproject.service.impl;

import com.example.interviewproject.dto.UserOverview;
import com.example.interviewproject.dto.UserRegistrationDto;
import com.example.interviewproject.exception.Error;
import com.example.interviewproject.exception.UserNotFoundException;
import com.example.interviewproject.mapper.UserMapper;
import com.example.interviewproject.repository.UserRepository;
import com.example.interviewproject.service.UserService;
import com.example.interviewproject.validator.UserRegistrationValidator;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final List<UserRegistrationValidator> validators;
  private final UserMapper userMapper;

  @Override
  public UserOverview register(UserRegistrationDto dto) {
    validators.forEach(validator -> validator.validate(dto));
    return userMapper.mapToOverview(userRepository.save(userMapper.mapToEntity(dto)));
  }

  @Override
  public UserOverview getByEmail(String email) {
    return userMapper.mapToOverview(
        userRepository
            .findByEmail(email)
            .orElseThrow(() -> new UserNotFoundException(Error.USER_NOT_FOUND)));
  }
}
