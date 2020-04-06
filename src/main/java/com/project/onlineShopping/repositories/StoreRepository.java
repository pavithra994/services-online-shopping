package com.project.onlineShopping.repositories;
import com.project.onlineShopping.models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, Integer> {
}
