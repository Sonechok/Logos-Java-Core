package com.Alex.lesson21;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})

public @interface MyAnnotation {
    //тип поля
    FieldType type();
    //причзначення поля
    String role() default "NO_DATA";
}
