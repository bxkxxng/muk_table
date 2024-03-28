package com.example.muk_table.domain.primary.restaurant.model.entity;

import com.example.muk_table.domain.common.BaseEntity;
import com.example.muk_table.domain.primary.owner.model.entity.Owner;
import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, of = {"id"})
@Getter
@Table(name = "RESTAURANT")
public class Restaurant extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RESTAURANT_NAME")
    private String restaurantName;

    @Column(name = "RESTAURANT_NUMBER")
    private String restaurantNumber;

    @Column(name = "RESTAURANT_ADDRESS")
    private String restaurantAddress;

    @JsonBackReference
    @OneToMany(mappedBy = "restaurant")
    private List<Reservation> reservationList;

    @JsonBackReference
    @OneToMany(mappedBy = "restaurant")
    private List<Owner> ownerList;

    @Builder
    public Restaurant(Long id, String restaurantName, String restaurantNumber, String restaurantAddress) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantNumber = restaurantNumber;
        this.restaurantAddress = restaurantAddress;
    }
}
