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
@Table(name = "OWNER")
public class Owner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "OWNER_ID")
    private String ownerId;

    @Column(name = "OWNER_PASSWORD")
    private String ownerPassword;

    @Column(name = "RESTORANT_ID")
    private Long notice;


    @Builder
    public Owner(Long id, String ownerId, String ownerPassword, Long notice) {
        this.id = id;
        this.ownerId = ownerId;
        this.ownerPassword = ownerPassword;
        this.notice = notice;
    }
}
