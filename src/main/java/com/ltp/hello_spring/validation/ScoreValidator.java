package com.ltp.hello_spring.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.*;

public class ScoreValidator implements ConstraintValidator<Score,String> {
List<String> scores=Arrays.asList("A+","A-","A","B+","B-","B","C+","C-","C","D+","D-","D","F");
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return scores.contains(value);
    }

}
