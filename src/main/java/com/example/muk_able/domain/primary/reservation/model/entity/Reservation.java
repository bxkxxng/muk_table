package com.example.muk_able.domain.primary.reservation.model.entity;

import com.example.muk_able.domain.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
@EqualsAndHashCode(callSuper = true,of = {"id"})
@Getter
@Table(name = "RESERVATION")
public class Reservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "RESTORANT_ID")
    private Long restorantId;

    @Column(name = "NOTICE")
    private String notice;

    @Column(name = "STATUS")
//    @Convert(converter = StatusType.class)
//    private StatusType status;
    private String status;

    @Builder
//    public Reservation(Long id, Long customerId, Long restorantId, String notice, StatusType status) {
    public Reservation(Long id, Long customerId, Long restorantId, String notice, String status) {
        this.id = id;
        this.customerId = customerId;
        this.restorantId = restorantId;
        this.notice = notice;
        this.status = status;
    }
}
