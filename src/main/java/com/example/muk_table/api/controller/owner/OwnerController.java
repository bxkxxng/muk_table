package com.example.muk_table.api.controller.owner;

import com.example.muk_table.core.common.response.CommonResponse;
import com.example.muk_table.core.common.response.ResponseCode;
import com.example.muk_table.core.service.owner.OwnerService;
import com.example.muk_table.core.service.reservation.ReservationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Owner API", description = "점주 기능 API")
public class OwnerController {

    private final OwnerService ownerService;
    private final ReservationService reservationService;

    @Operation(
            summary = "입장 연락 수동 API",
            description = "대기중인 손님에게 입장하라는 연락을 합니다."
    )
    @PutMapping(value = "/enter")
    /*
    1. owner 로그인이 되있어야함.
        1-1. 로그인이 되어있다면 점주의 id로 restaurantId 조회 후 기능 활성화
        1-2. 로그인이 안됐다면 exception
    2. batch 타이밍 즉, 배치로 대기 -> call로 바뀌는 시점에 점주가 입장하라는 연락을 보내는 타이밍을 어떻게 설정 할 것인지?
    3. owner의 로그인 세션은 얼마나 유지되는지?
    4. owner 세션 화면 -> 다시 게스트 모드로의 전환? device가 두대인가,,,,
    */
    public ResponseEntity<CommonResponse<Object>> saveReservationApi(long reservationId) {
        return ResponseEntity.ok().body(new CommonResponse<>(reservationService.updateCustomerStatus(reservationId), ResponseCode.SUCCESS_UPDATE));
    }


    // (추후) 일자 별 예약 목록 리스트 (점주들 통계확인용도)

}
