package com.tallstech.hizir.common.base.constant;

import lombok.Getter;


public enum IdTypes {
    DISASTER("disasterId"),
    SENDER("senderId"),
    RECEIVER("receiverId"),
    COURIER("courierId");

    IdTypes(String type) {this.type = type;}

    @Getter
    private String type;
}
