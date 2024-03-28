package com.example.muk_table.domain.primary.reservation.repository.querydsl;

import com.example.muk_table.domain.primary.reservation.model.entity.Reservation;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.muk_table.domain.primary.reservation.model.entity.QReservation.reservation;

@Repository
@RequiredArgsConstructor
public class ReservationRepositoryQueryDslImpl implements ReservationRepositoryQueryDsl {

    private final JPAQueryFactory jpaQueryFactory;

    /*
    WAIT("00","WAIT")
    CALL("01","CALL")
    CONFIRM("02","CONFIRM")
    CANCEL("03","CANCEL")
    */
    @Override
    public List<Reservation> findAllReservationListByDate(LocalDate today) {
        return jpaQueryFactory.select(reservation)
                .from(reservation)
                .where(reservation.createdAt.goe(today.atStartOfDay())
                        .and(reservation.status.eq("00")))
                .fetch();
    }
}
