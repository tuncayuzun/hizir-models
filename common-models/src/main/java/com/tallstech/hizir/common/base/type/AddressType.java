package com.tallstech.hizir.common.base.type;

public record AddressType(
         String type,
         String city,
         String county,
         String country,
         String postCode,
         String addressDetail
) {
}
