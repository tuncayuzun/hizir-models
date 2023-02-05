package com.tallstech.hizir.common.base.type;

import java.time.LocalDateTime;


public record IndividualType(
        Long id,
        String firstName,
        String familyName,
        LocalDateTime dateOfBirth,
        String dateOfPlace,
        String gender,
        String role,
        IdentificationType identification,
        ContactType contact
) {
}
