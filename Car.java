package com.sathvika.carrental.model;

public class Car {
    private String name;
    private boolean available;
    private double price;

    public Car(String name, boolean available, double price) {
        this.name = name;
        this.available = available;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

