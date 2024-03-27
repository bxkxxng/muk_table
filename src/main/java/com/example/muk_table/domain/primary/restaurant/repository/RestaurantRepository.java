package com.example.muk_table.domain.primary.restaurant.repository;

import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import com.example.muk_table.domain.primary.restaurant.repository.querydsl.RestaurantRepositoryQueryDsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>, RestaurantRepositoryQueryDsl {
}
