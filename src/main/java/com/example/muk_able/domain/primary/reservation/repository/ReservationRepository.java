package com.example.muk_able.domain.primary.reservation.repository;

import com.example.muk_able.domain.primary.reservation.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
