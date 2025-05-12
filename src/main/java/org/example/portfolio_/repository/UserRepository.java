package org.example.portfolio_.repository;

import org.example.portfolio_.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
