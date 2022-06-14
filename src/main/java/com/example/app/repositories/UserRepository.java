package com.example.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.app.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
