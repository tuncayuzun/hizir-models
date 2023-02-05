package com.tallstech.hizir.common.base.type;

public record OrganizationType(
         Long id,
         String type,
         String name,
         String description,
         ContactType contact,
         ContactPersonType contactPerson
) {
}
