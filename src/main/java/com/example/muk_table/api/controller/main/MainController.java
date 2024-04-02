package com.example.muk_table.api.controller.main;

import com.example.muk_table.core.common.response.CommonResponse;
import com.example.muk_table.core.common.response.ResponseCode;
import com.example.muk_table.core.dto.request.owner.OwnerRequest;
import com.example.muk_table.core.dto.request.reservation.ReservationRequest;
import com.example.muk_table.core.service.owner.OwnerService;
import com.example.muk_table.core.service.reservation.ReservationService;
import com.example.muk_table.domain.primary.owner.model.entity.Owner;
import com.example.muk_table.domain.primary.restaurant.model.entity.Restaurant;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Main API", description = "웹 메인 API")
public class MainController {

    private final OwnerService ownerService;
    private final ReservationService reservationService;

    //회원가입
    @Operation(
            summary = "점주 등록 API",
            description = "점주 회원가입 합니다."
    )
    @PostMapping(value = "/signup/owner")

    public ResponseEntity<CommonResponse<Object>> saveReservation(@RequestBody Owner owner) {
        return ResponseEntity.ok().body(new CommonResponse<>(ownerService.saveOwner(owner), ResponseCode.SUCCESS_INSERT));
    }

    //로그인

    //실시간 대기인원 확인

    @Operation(
            summary = "현재 대기중인 예약 조회 API",
            description = "현재 대기중인 예약을 조회합니다."
    )
    @GetMapping(value = "/search/reservation")
    /*
    1. 배치로도 구성 필요 (5~10초 간격이 적당해보임)
    2. /search/reservation이 활성화 되는 건 새로고침 버튼 눌렀을 때.

     */
    public ResponseEntity<CommonResponse<Object>> getReservationList() {
        return ResponseEntity.ok().body(new CommonResponse<>(reservationService.getReservationList(), ResponseCode.SUCCESS_SELECT));
    }
}
