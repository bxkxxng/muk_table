package com.example.muk_table.domain.primary.owner.model.entity;

import com.example.muk_table.domain.common.BaseEntity;
import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, of = {"id"})
@Getter
@Table(name = "OWNER")
public class Owner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "OWNER_LOGIN_ID")
    private String ownerLoginId;

    @Column(name = "OWNER_PASSWORD")
    private String ownerPassword;

    @JsonBackReference
    @ManyToOne
    private Restaurant restaurant;

    @Builder
    public Owner(Long id, String ownerLoginId, String ownerPassword, Restaurant restaurant) {
        this.id = id;
        this.ownerLoginId = ownerLoginId;
        this.ownerPassword = ownerPassword;
        this.restaurant = restaurant;
    }
}
