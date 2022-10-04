package com.example.interviewproject.exception;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {

  private LocalDateTime time;
  private Integer code;
  private HttpStatus status;
  private String message;
}
