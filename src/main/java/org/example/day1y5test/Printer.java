package org.example.day1y5test;

public abstract class Printer {
    private int times;

    public Printer() {
    }

    public Printer(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "times=" + times +
                '}';
    }
    public abstract void printTimes();
}
