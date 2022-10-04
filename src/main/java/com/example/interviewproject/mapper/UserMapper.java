package com.example.interviewproject.mapper;

import com.example.interviewproject.dto.UserOverview;
import com.example.interviewproject.dto.UserRegistrationDto;
import com.example.interviewproject.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

  public User mapToEntity(UserRegistrationDto dto){
    return User.builder()
        .name(dto.getName())
        .birthDate(dto.getBirthDate())
        .email(dto.getEmail())
        .password(dto.getPassword())
        .build();
  }

  public UserOverview mapToOverview(User user){
    return UserOverview.builder()
        .id(user.getId())
        .name(user.getName())
        .birthDate(user.getBirthDate())
        .email(user.getEmail())
        .build();
  }

}
