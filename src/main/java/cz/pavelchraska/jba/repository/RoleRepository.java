package cz.pavelchraska.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.pavelchraska.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
