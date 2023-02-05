package com.tallstech.hizir.common.base.constant;

import lombok.Getter;


public enum UnitTypes {
    KILOGRAM("kg"),
    PAIR("pr"),
    NUMBER("no");

    UnitTypes(String type){
        this.type = type;
    }
    @Getter
    private String type;


}
