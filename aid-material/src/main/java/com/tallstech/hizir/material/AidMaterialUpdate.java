package com.tallstech.hizir.material;

import com.tallstech.hizir.material.constant.MaterialType;


public record AidMaterialUpdate(
        String id,
        MaterialType type,
        String title,
        String description,
        Quantity quantity,
        String note,
        String disaster
) {
}
