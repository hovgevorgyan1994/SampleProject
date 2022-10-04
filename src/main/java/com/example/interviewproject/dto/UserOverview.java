package com.example.interviewproject.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserOverview {

  private Long id;
  private String name;
  private LocalDate birthDate;
  private String email;
}
