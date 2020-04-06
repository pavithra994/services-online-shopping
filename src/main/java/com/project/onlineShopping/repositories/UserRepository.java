package com.project.onlineShopping.repositories;
import com.project.onlineShopping.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
}
