package com.bigcake.repository;

import com.bigcake.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Bigcake on 9/9/2017
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
