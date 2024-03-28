package com.example.muk_table.core.dto.request.reservation;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class ReservationRequest {

    @Schema
    private long id;

    @NotNull
    @Schema(description = "회원 ID", defaultValue = "1 or 2")
    private long customerId;

    @NotNull
    @Schema(description = "매장 ID", defaultValue = "1 or 2")
    private long restaurantId;

    @Schema(description = "전달사항", defaultValue = "아기용 하이체어가 필요해요.")
    private String notice;

    @Schema(description = "상태", defaultValue = "00")
    private String status;

    @Builder

    public ReservationRequest(long id, long customerId, long restaurantId, String notice, String status) {
        this.id = id;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.notice = notice;
        this.status = status;
    }
}
