package com.example.muk_table.core.dto.request.owner;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class OwnerRequest {

    @NotNull
    @Schema(description = "점주 ID", defaultValue = "1 or 2")
    private long ownerId;

    @NotNull
    @Schema(description = "매장 ID", defaultValue = "1 or 2")
    private long restaurantId;

}
