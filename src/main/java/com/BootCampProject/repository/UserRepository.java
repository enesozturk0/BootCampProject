package com.BootCampProject.repository;

import com.BootCampProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User getByFirstName(String firstName);
}
