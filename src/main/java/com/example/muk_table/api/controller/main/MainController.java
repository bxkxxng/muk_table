package com.example.muk_table.api.controller.main;

import com.example.muk_table.core.common.response.CommonResponse;
import com.example.muk_table.core.common.response.ResponseCode;
import com.example.muk_table.core.service.reservation.ReservationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Main API", description = "웹 메인 API")
public class MainController {

    private final ReservationService reservationService;

    //회원가입

    //로그인

    //실시간 대기인원 확인

    @Operation(
            summary = "현재 대기중인 예약 조회 API",
            description = "현재 대기중인 예약을 조회합니다."
    )
    @GetMapping(value = "/search/reservation")
    public ResponseEntity<CommonResponse<Object>> getReservationListApi() {
        //static 데이터
        return ResponseEntity.ok().body(new CommonResponse<>(reservationService.getReservationList(), ResponseCode.SUCCESS_SELECT));
    }
}
