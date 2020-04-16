package com.Alex.lesson6;

public class WorkerMonth implements Salary {
    @Override
    public int salaryGet(int hours, int month, int bonus, int fine, int salaryForHour, int salaryForMonth) {
        return ((month*salaryForMonth)-fine+bonus);
    }
}
