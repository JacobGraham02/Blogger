package com.jacobdgraham.ats.repository;

import com.jacobdgraham.ats.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository extends CrudRepository<User, UUID> {
    Optional<User> findByUsername(final String username);
}
