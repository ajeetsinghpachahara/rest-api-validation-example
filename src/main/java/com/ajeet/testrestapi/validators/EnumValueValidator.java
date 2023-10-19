package com.ajeet.testrestapi.validators;


import com.ajeet.testrestapi.constants.enums.BaseEnum;
import com.ajeet.testrestapi.custom.annotations.EnumValue;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EnumValueValidator implements ConstraintValidator<EnumValue, Integer> {
    private Class<? extends BaseEnum> enumClass;

    @Override
    public void initialize(EnumValue constraintAnnotation) {
        this.enumClass = constraintAnnotation.enumClass();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Null values are considered valid
        }

        BaseEnum[] enumValues = enumClass.getEnumConstants();

        for (BaseEnum enumValue : enumValues) {
            if (value.equals((enumValue).getValue())) {
                return true;
            }
        }

        return false;
    }
}
