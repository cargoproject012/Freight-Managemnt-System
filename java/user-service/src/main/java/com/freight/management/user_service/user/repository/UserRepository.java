package com.freight.management.user_service.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freight.management.user_service.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
