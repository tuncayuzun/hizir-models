package com.tallstech.hizir.material;

import com.tallstech.hizir.common.base.type.QuantityType;
import com.tallstech.hizir.common.base.constant.StatusTypes;


public record AidMaterialUpdateDto(
        String id,
        String category,
        String type,
        String description,
        QuantityType quantity,
        String note,
        StatusTypes status
) {
}
