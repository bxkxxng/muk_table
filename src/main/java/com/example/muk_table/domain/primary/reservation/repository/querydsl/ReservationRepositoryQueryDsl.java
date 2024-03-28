package com.example.muk_table.domain.primary.reservation.repository.querydsl;

import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import java.time.LocalDate;
import java.util.List;

public interface ReservationRepositoryQueryDsl {
    List<Reservation> findAllReservationListByDate(LocalDate today);

}
