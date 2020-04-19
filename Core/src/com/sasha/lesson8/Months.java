package com.sasha.lesson8;

public enum Months {
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
    private int day;
    private Seasons season;

    Months(int day, Seasons season) {
        this.day = day;
        this.season = season;
    }

    public int getDay() {
        return day;
    }

    public Seasons getSeason() {
        return season;
    }
}
