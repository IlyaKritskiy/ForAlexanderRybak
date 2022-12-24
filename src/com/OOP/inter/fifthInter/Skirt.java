package com.OOP.inter.fifthInter;

public class Skirt extends Clothes implements WomenClothing{

    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {

    }

    @Override
    public void dressWomen(Clothes[] clothes) {

    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
