package com.Alex.lesson9.Documentation;

public enum Months {
    //Enum Seasons with its constants
    JANUARY(31,Seasons.WINTER),
    FEBRUARY(28, Seasons.SPRING),
    MARCH(31, Seasons.SUMMER),
    APRIL(30, Seasons.AUTUMN),
    MAY(31, Seasons.WINTER),
    JUNE(30, Seasons.SPRING),
    JULY(31, Seasons.SUMMER),
    AUGUST(30,Seasons.AUTUMN),
    SEPTEMBER(31, Seasons.WINTER),
    OCTOBER(30, Seasons.SPRING),
    NOVEMBER(31, Seasons.SUMMER),
    DECEMBER(30, Seasons.AUTUMN);

    private int day;             // Numbers of days
    private Seasons season;      // Name of season

    /*constructor with parameters*/
    Months(int day, Seasons season) {
        this.day = day;
        this.season = season;
    }

    //The method for obtaining a variable "day"
    public int getDay() {
        return day;
    }

    //The method for obtaining a variable seasons
    public Seasons getSeason() {
        return season;
    }
}
