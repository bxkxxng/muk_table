package com.example.muk_table.domain.primary.customer.model.entity;

import com.example.muk_table.domain.common.BaseEntity;
import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PEOPLE_NUMBER")
    private String peopleNumber;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @JsonBackReference
    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservationList;

    @Builder
    public Customer(Long id, String peopleNumber, String phoneNumber) {
        this.id = id;
        this.peopleNumber = peopleNumber;
        this.phoneNumber = phoneNumber;
    }
}
