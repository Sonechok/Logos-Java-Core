package com.sasha.lesson6;

public class WorkerHours implements Salary{
    @Override
    public int salaryGet(int hours, int month, int bonus, int fine, int salaryForHour, int salaryForMonth) {
        return ((hours*salaryForHour)-fine+bonus);
    }
}
