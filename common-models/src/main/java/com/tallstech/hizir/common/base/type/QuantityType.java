package com.tallstech.hizir.common.base.type;

import com.tallstech.hizir.common.base.constant.UnitTypes;
public record QuantityType(
        UnitTypes type,
        int count
) {
}
