package com.tallstech.hizir.material;

import com.tallstech.hizir.material.constant.UnitType;


public record Quantity(
        UnitType type,
        int count
) {
}
