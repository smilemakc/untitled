package com.company;

/**
 * Created by balashov on 10.01.15.
 */
public enum Day implements Runnable {
    SUNDAY (7,"GOOD  DAY "),     MONDAY (1,"HARD"),    TUESDAY(2,"WORK"),    WEDNESDAY(3,"MIDDLE"),
    THURSDAY(4,"WORK"),    FRIDAY(5,"SHORT DAY"),    SATURDAY(6,"REST");

    Day(int ordinal, String s) {

    }

    @Override
    public void run() {
        System.out.println("name()=" + name() +
                ", toString()=" + toString());
    }
}
