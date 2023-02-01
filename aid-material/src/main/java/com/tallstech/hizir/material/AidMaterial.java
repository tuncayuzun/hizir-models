package com.tallstech.hizir.material;

import java.util.UUID;

import com.tallstech.hizir.material.constant.MaterialType;


public record AidMaterial(
        String id,
        MaterialType type,
        String title,
        String description,
        Quantity quantity,
        String note,
        String disaster
) {
}
