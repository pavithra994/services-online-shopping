package com.project.onlineShopping.services;
import com.project.onlineShopping.models.Store;
import com.project.onlineShopping.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store addNewStore(Store store){
        return storeRepository.save(store);
    }

}
