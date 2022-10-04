package com.example.interviewproject.api;

import com.example.interviewproject.dto.UserOverview;
import com.example.interviewproject.dto.UserRegistrationDto;
import org.springframework.http.ResponseEntity;

public interface UserApi {

  ResponseEntity<UserOverview> register(UserRegistrationDto dto);

  ResponseEntity<UserOverview> getByEmail(String email);
}
