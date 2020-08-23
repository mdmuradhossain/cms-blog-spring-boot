package io.murad.cms.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.murad.cms.blog.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
	Optional<User> findByEmail(String email);
	
}
