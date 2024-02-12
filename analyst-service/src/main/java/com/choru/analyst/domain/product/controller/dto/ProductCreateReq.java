package com.choru.analyst.domain.product.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductCreateReq(
        @NotNull@NotBlank String name,
        @NotNull Integer price
) {
}
