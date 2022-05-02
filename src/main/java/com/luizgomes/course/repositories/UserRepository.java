package com.luizgomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizgomes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
