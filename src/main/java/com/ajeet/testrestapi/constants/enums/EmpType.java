package com.ajeet.testrestapi.constants.enums;

import com.ajeet.testrestapi.constants.enums.BaseEnum;

public enum EmpType implements BaseEnum {

    OFFICE_BOY(1), ENGINEER(2), MANAGER(3);

    private int value;
    EmpType(int i) {
        value=i;
    }
    @Override
    public int getValue() {
        return value;
    }
}
