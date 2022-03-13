package com.company;

public class Information {
    private int yearOfManufacture;
    private String model;
    private int price;
    private String color;

    public Information(int yearOfManufacture, String model, int price, String color) {
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nYear of manufacture : " + yearOfManufacture + "\nModel : "
                + model + "\nPrice : " + price + "\nColor : "+color;
    }

}
