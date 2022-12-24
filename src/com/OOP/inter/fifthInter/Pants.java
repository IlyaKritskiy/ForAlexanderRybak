package com.OOP.inter.fifthInter;

public class Pants extends Clothes implements MensClothing, WomenClothing{

    public Pants(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressMen(Clothes[] clothes) {

    }

    @Override
    public void dressWomen() {

    }

    @Override
    public void dressWomen(Clothes[] clothes) {

    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
