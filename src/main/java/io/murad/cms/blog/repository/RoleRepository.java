package io.murad.cms.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.murad.cms.blog.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
