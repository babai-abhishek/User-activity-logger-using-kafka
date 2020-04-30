package com.example.demo.repository;

import com.example.demo.entity.UserActivity;
import org.springframework.data.repository.CrudRepository;

public interface UserActivityRepository extends CrudRepository<UserActivity, Integer> {
}
