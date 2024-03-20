package com.example.muk_able.domain.primary.customer.model.entity;

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
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RESTORANT_ID")
    private Long restorantId;

    @Column(name = "PEOPLE_NUMBER")
    private String peopleNumber;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Builder

    public Customer(Long id, Long restorantId, String peopleNumber, String phoneNumber) {
        this.id = id;
        this.restorantId = restorantId;
        this.peopleNumber = peopleNumber;
        this.phoneNumber = phoneNumber;
    }
}
