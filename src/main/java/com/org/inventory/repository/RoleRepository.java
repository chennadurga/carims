package com.org.inventory.repository;

import com.org.inventory.model.ERole;
import com.org.inventory.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
