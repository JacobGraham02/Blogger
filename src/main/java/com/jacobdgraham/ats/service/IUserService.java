package com.jacobdgraham.ats.service;

import com.jacobdgraham.ats.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    Optional<User> findByUsername(final String username);
}
