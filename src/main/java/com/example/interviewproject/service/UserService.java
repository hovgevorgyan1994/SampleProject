package com.example.interviewproject.service;

import com.example.interviewproject.dto.UserOverview;
import com.example.interviewproject.dto.UserRegistrationDto;

public interface UserService {

  UserOverview register(UserRegistrationDto dto);

  UserOverview getByEmail(String email);

}
