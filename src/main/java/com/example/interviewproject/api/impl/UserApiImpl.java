package com.example.interviewproject.api.impl;

import static org.springframework.http.HttpStatus.CREATED;

import com.example.interviewproject.api.UserApi;
import com.example.interviewproject.dto.UserOverview;
import com.example.interviewproject.dto.UserRegistrationDto;
import com.example.interviewproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserApiImpl implements UserApi {

  private final UserService userService;

  @Override
  @PostMapping
  public ResponseEntity<UserOverview> register(@RequestBody UserRegistrationDto dto) {
    return ResponseEntity.status(CREATED).body(userService.register(dto));
  }

  @Override
  @GetMapping
  public ResponseEntity<UserOverview> getByEmail(@RequestBody String email) {
    return ResponseEntity.ok(userService.getByEmail(email));
  }
}
