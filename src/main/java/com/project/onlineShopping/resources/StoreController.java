package com.project.onlineShopping.resources;

import com.project.onlineShopping.models.Store;
import com.project.onlineShopping.repositories.StoreRepository;
import com.project.onlineShopping.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping("/api/addStore")
    public String saveBook(@RequestBody Store store) {
        Store store1 = storeService.addNewStore(store);
        return "Added store with id : " + store1.getId();
    }
}
