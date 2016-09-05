package cz.pavelchraska.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.pavelchraska.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
