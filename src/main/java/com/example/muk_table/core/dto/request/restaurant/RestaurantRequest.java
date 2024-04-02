package com.example.muk_table.core.dto.request.restaurant;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class RestaurantRequest {

    @NotNull
    @Schema(description = "매장 이름", defaultValue = "피나치공")
    private String restaurantName;

    @NotNull
    @Schema(description = "매장 전화번호", defaultValue = "02-1234-5678")
    private String restaurantNumber;

    @NotNull
    @Schema(description = "매장 주소", defaultValue = "서울 특별시 금천구")
    private String restaurantAddress;

    @Builder

    public RestaurantRequest(String restaurantName, String restaurantNumber, String restaurantAddress) {
        this.restaurantName = restaurantName;
        this.restaurantNumber = restaurantNumber;
        this.restaurantAddress = restaurantAddress;
    }
}
