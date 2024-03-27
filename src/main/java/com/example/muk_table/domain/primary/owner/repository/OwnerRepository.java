package com.example.muk_table.domain.primary.owner.repository;

import com.example.muk_table.domain.primary.owner.repository.querydsl.OwnerRepositoryQueryDsl;
import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Reservation, Long>, OwnerRepositoryQueryDsl {
}
