package com.tallstech.hizir.material;

public record AidMaterialCategoryDto(
        String id,
        String categoryName,
        boolean isActive,
        String createdDate,
        String lastModifiedDate,
        Long version
) {
}
