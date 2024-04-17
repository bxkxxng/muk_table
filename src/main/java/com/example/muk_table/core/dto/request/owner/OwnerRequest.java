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
    @Schema(description = "점주 ID", defaultValue = "owner3")
    private String ownerLoginId;

    @NotNull
    @Schema(description = "점주 PASSWORD", defaultValue = "pasta")
    private String ownerPassword;

}
