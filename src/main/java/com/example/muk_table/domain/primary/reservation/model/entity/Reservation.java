package com.example.muk_table.domain.primary.reservation.model.entity;

import com.example.muk_table.domain.common.BaseEntity;
import com.example.muk_table.domain.primary.customer.model.entity.Customer;
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
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@EqualsAndHashCode(callSuper = true, of = {"id"})
@Getter
@NoArgsConstructor
@SQLDelete(sql = "UPDATE RESERVATION SET deleted = true WHERE id = ?")
@Table(name = "RESERVATION")
@Where(clause = "deleted = false")
public class Reservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne
    private Customer customer;

    @JsonBackReference
    @ManyToOne
    private Restaurant restaurant;

    @Column(name = "NOTICE")
    private String notice;

    @Column(name = "STATUS")
//    @Convert(converter = StatusType.class)
//    private StatusType status;
    private String status;

    @Builder
    public Reservation(Long id, Customer customer, Restaurant restaurant, String notice, String status) {
        this.id = id;
        this.customer = customer;
        this.restaurant = restaurant;
        this.notice = notice;
        this.status = status;
    }
}
