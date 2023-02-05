package com.tallstech.hizir.common.base.type;

import java.time.LocalDateTime;


public record ContactPersonType(
        String firstName,
        String familyName,
        LocalDateTime dateOfBirth,
        String dateOfPlace,
        String gender,
        String role,
        ContactPointType contactPoint
) {
}
