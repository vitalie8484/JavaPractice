package com.vitalie.hipodrom;

public class Horse {

    private String namme;
    private double speed;
    private double distance;

    public Horse(String namme, double speed, double distance) {
        this.namme = namme;
        this.speed = speed;
        this.distance = distance;
    }

    public String getNamme() {
        return namme;
    }

    public void setNamme(String namme) {
        this.namme = namme;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move() {
        distance += Math.random() * speed;
    }

    public void print() {
        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= Math.round(distance); i++) {
            out = out.append(".");
        }
        out.append(namme);
        System.out.println(out);
    }
}
