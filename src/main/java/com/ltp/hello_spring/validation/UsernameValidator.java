package com.ltp.hello_spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<Username, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String REGEX = "^[a-zA-Z0-9]*$";
        return value.matches(REGEX);
    }
}