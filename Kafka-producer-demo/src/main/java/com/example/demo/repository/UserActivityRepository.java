package com.example.demo.repository;

import model.UserActivity;
import org.springframework.data.repository.CrudRepository;

public interface UserActivityRepository extends CrudRepository<UserActivity, Integer> {
}
