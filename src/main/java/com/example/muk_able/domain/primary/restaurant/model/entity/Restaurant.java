package com.example.muk_able.domain.primary.restaurant.model.entity;

import com.example.muk_able.domain.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Table(name = "RESTAURANT")
public class Restaurant extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RESTAURANT_NAME")
    private String restaurant_name;

    @Column(name = "RESTAURANT_NUMBER")
    private String restaurantNumber;

    @Column(name = "RESTAURANT_ADDRESS")
    private String restaurantAddress;

    @Builder
    public Restaurant(Long id, String restaurant_name, String restaurantNumber, String restaurantAddress) {
        this.id = id;
        this.restaurant_name = restaurant_name;
        this.restaurantNumber = restaurantNumber;
        this.restaurantAddress = restaurantAddress;
    }
}
