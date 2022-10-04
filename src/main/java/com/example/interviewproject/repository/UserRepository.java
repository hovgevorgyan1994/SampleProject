package com.example.interviewproject.repository;

import com.example.interviewproject.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hovhannes Gevorgyan on 22.09.2022
 */
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByEmail(String email);

  boolean existsByEmailIgnoreCase(String email);

}
