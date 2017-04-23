package com.monodev.repository;

import com.monodev.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by monodev on 2017/4/23.
 */
public interface UserRepository extends MongoRepository<UserRepository,String> {
    User findByUserName(String username);
}
