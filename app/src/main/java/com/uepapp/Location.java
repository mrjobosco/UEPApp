package com.uepapp;

/**
 * Created by ehaadmin on 10/23/17.
 */

public class Location {
    private String name;
    private int capacity;
    private double logitude;
    private double latitude;

    public Location(String name, int capacity, double logitude, double latitude) {
        this.name = name;
        this.capacity = capacity;
        this.logitude = logitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLogitude() {
        return logitude;
    }

    public void setLogitude(double logitude) {
        this.logitude = logitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
