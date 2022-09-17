package com.project.purplecow.controller;

import com.project.purplecow.entity.Item;
import com.project.purplecow.repository.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemRepository repository;

    ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    /**
     * retrieve all Items in the database
     * @return List of Items
     */
    @GetMapping("/items")
    List<Item> AllItems() {
        return repository.findAll();
    }

    /**
     * Inserts a new Item into the database
     * @param newItem the Item to be inserted, must be JSON format
     * @return new Item entity as JSON, includes generated ID and name
     */
    @PostMapping("/new/item")
    Item newItem(@RequestBody Item newItem) {
        return repository.save(newItem);
    }

    /**
     * Update an existing Item or create a new Item if no existing item with matching ID exists
     * @param updatedItem Item to be updated
     * @param id ID of Item to be updated
     * @return updated/new Item
     */
    @PutMapping("/update/{id}")
    Item updateItem(@RequestBody Item updatedItem, @PathVariable Long id) {

        return repository.findById(id)
                .map(item -> {
                    item.setName(updatedItem.getName());
                    return repository.save(item);
                })
                .orElseGet(() -> {
                    updatedItem.setId(id);
                    return repository.save(updatedItem);
                });
    }

    /**
     * Deletes an Item from the database
     * @param id ID of Item to be removed
     */
    @DeleteMapping("remove/{id}")
    void removeItem(@PathVariable Long id) {
        repository.deleteById(id);
    }





}
