package com.example.muk_table.domain.primary.owner.repository.querydsl;

import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import java.time.LocalDate;
import java.util.List;

public interface OwnerRepositoryQueryDsl {
    List<Reservation> findAllReservationList(LocalDate today);
}
