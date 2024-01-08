package org.example.day1y8.test3;

public class Print {
    private Ad ad;
    private Car car;
    private Notice notice;

    public Print() {
    }

    public Print(Ad ad, Car car, Notice notice) {
        this.ad = ad;
        this.car = car;
        this.notice = notice;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "Print{" +
                "ad=" + ad +
                ", car=" + car +
                ", notice=" + notice +
                '}';
    }


}
