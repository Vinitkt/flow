package com.flow.query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flow.query.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

	ApplicationUser findByUserName(String username);
}
