package com.project.purplecow.repository;


import com.project.purplecow.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

interface ItemRepository extends JpaRepository<Item, Long> {
}
