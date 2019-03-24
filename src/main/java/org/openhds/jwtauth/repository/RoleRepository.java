package org.openhds.jwtauth.repository;

import org.openhds.jwtauth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
