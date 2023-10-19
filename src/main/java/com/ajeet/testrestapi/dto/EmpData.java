package com.ajeet.testrestapi.dto;


import com.ajeet.testrestapi.constants.enums.EmpState;
import com.ajeet.testrestapi.constants.enums.EmpType;
import com.ajeet.testrestapi.custom.annotations.EnumValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpData {
    @NotBlank
    private String empName;
    @NotNull
    @EnumValue(enumClass = EmpType.class)
    private Integer empType;

    @NotNull
    @EnumValue(enumClass = EmpState.class)
    private Integer state;
}
