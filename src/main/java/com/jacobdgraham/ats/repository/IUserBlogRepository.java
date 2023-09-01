package com.jacobdgraham.ats.repository;

import com.jacobdgraham.ats.entity.UserBlog;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface IUserBlogRepository extends CrudRepository<UserBlog, UUID> {

}
