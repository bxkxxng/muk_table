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

    @Schema(description = "예약번호", defaultValue = "1 or 2")
    private Long id;

    @NotNull
    @Schema(description = "고객 이용인원", defaultValue = "3 or 4")
    private Long peopleNumber;

    @NotNull
    @Schema(description = "고객 전화번호", defaultValue = "01023243763")
    private String phoneNumber;

    @NotNull
    @Schema(description = "매장 ID", defaultValue = "1 or 2")
    private Long restaurantId;

    @Schema(description = "전달사항", defaultValue = "아기용 하이체어가 필요해요.")
    private String notice;

    @Schema(description = "상태", defaultValue = "00")
    private String status;

    @Builder
    public ReservationRequest(Long id,Long peopleNumber, String phoneNumber, long restaurantId, String notice, String status) {
        this.id = id;
        this.peopleNumber = peopleNumber;
        this.phoneNumber = phoneNumber;
        this.restaurantId = restaurantId;
        this.notice = notice;
        this.status = status;
    }
}
