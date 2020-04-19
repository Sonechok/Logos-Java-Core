package com.sasha.lesson21;

import java.util.ArrayList;

public class Human {
    @MyAnnotation(type = FieldType.PRIMITIVE_TYPE_NUMBER, role = "Age of human")
    int age;
    @MyAnnotation(type = FieldType.ANOTHER_CLASS, role = "Height of human")
    Double height;
    @MyAnnotation(type = FieldType.STRING, role = "Gender of human")
    String gender;
    @MyAnnotation(type = FieldType.PRIMITIVE_TYPE_NUMBER, role = "Work experience")
    short experience;
    @MyAnnotation(type = FieldType.COLLECTION, role = "Array of companies in which person was working")
    ArrayList<String> nameOfCompanies = new ArrayList<>();
    @MyAnnotation(type = FieldType.STRING, role = "Position in current company")
    String position;

    String dateOfBirthday;
    String nativeCity;

}
