package com.tallstech.hizir.common.base.constant;

import lombok.Getter;


public enum StatusTypes {
    CREATED("created"),
    ACKNOWLEDGE("acknowledge"),
    SHIPPED("shipped"),
    DELIVERED("delivered"),
    CANCELED("cancelled");

    StatusTypes(String type) {this.type = type;}

    @Getter
    private String type;
}
