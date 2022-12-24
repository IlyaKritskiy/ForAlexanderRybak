package com.OOP.inter.fifthInter;

public class Tie extends Clothes implements MensClothing{

    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressMen(Clothes[] clothes) {

    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
