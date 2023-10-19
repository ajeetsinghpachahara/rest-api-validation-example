package com.ajeet.testrestapi.constants.enums;

public enum EmpState implements BaseEnum{

    ACTIVE(5), INACTIVE(6), DELETED(7);

    private int value;
    EmpState(int i) {
        value=i;
    }


    @Override
    public int getValue() {
        return value;
    }
}
