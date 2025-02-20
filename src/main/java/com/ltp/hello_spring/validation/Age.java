package com.ltp.hello_spring.validation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)

public @interface Age {
 String message() default "INVALID AGE";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
