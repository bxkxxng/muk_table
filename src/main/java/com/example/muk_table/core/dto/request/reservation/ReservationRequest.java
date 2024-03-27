package com.example.muk_table.core.dto.request.reservation;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class ReservationRequest {
    private long customerId;
    private long restaurantId;
    private String notice;
    private String status;

    @Builder

    public ReservationRequest(long customerId, long restaurantId, String notice, String status) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.notice = notice;
        this.status = status;
    }
}
