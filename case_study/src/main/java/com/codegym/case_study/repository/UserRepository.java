package com.codegym.case_study.repository;

import com.codegym.case_study.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String name);
}
