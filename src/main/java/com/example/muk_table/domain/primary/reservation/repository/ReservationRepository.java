package com.example.muk_table.domain.primary.reservation.repository;

import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import com.example.muk_table.domain.primary.reservation.repository.querydsl.ReservationRepositoryQueryDsl;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>, ReservationRepositoryQueryDsl {
}
