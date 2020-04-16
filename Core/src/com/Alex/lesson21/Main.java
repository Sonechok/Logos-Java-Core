package com.Alex.lesson21;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Class<Human> humanClass = Human.class;
        Date date = new Date();
        try {
            dataWriter(humanClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Task2");
        System.out.println("Date before conversion");
        System.out.println(date);
        System.out.println("Date after conversion (LocalDate)");
        System.out.println(convertToLocalDate(date));
        System.out.println("Date after conversion (LocalTime)");
        System.out.println(convertToLocalTime(date));
        System.out.println("Date after conversion (LocalDateTime)");
        System.out.println(convertToLocalDateTime(date));

    }

    public static void dataWriter(Class clazz) throws IOException {
        Field[] declaredFields = clazz.getDeclaredFields();
        FileWriter fileWriter = new FileWriter("dataLesson21.txt", false);
        for (Field field :declaredFields) {
            if(field.isAnnotationPresent(MyAnnotation.class)) {
                fileWriter.write(field.getName()+"\n");
            }
        }
        System.out.println("The data was recorded correctly");
        fileWriter.flush();
    }

    public static LocalDate convertToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static LocalTime convertToLocalTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}


