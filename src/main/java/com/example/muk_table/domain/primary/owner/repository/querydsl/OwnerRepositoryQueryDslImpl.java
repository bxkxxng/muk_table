package com.example.muk_table.domain.primary.owner.repository.querydsl;

import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.muk_table.domain.primary.reservation.model.entity.QReservation.reservation;

@Repository
@RequiredArgsConstructor
public class OwnerRepositoryQueryDslImpl implements OwnerRepositoryQueryDsl {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Reservation> findAllReservationList(LocalDate today) {
        return jpaQueryFactory.select(reservation)
                .from(reservation)
                .where(reservation.createdAt.goe(today.atStartOfDay()))
                .fetch();
    }
}
