package com.example.muk_table.api.controller.reservation;

import com.example.muk_table.core.common.response.CommonResponse;
import com.example.muk_table.core.common.response.ResponseCode;
import com.example.muk_table.core.dto.request.reservation.ReservationRequest;
import com.example.muk_table.core.service.reservation.ReservationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Reservation API", description = "웹 예약 API")
public class ReservationController {

    private final ReservationService reservationService;

    @Operation(
            summary = "식당 예약 등록 API",
            description = "현재 식당 예약을 등록합니다."
    )
    @PostMapping(value = "/reservation")
    public ResponseEntity<CommonResponse<Object>> saveReservationApi(@RequestBody ReservationRequest reservationRequest) {
        return ResponseEntity.ok().body(new CommonResponse<>(reservationService.saveReservation(reservationRequest), ResponseCode.SUCCESS_INSERT));
    }
}
