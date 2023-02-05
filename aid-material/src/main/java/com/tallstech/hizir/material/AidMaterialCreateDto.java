package com.tallstech.hizir.material;

import com.tallstech.hizir.common.base.type.QuantityType;


public record AidMaterialCreateDto(
        String category,
        String type,
        String description,
        QuantityType quantity,
        String note
) {
}
