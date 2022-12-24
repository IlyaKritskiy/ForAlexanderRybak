package com.OOP.inter.fifthInter;

public class Studio implements MensClothing, WomenClothing{

    @Override
    public void dressMen() {

    }

    @Override
    public void dressMen(Clothes[] clothes) {
        for(Clothes c : clothes){
            if(c instanceof MensClothing) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void dressWomen() {

    }

    @Override
    public void dressWomen(Clothes[] clothes) {
        for(Clothes c : clothes){
            if(c instanceof WomenClothing){
                System.out.println(c);
            }
        }
    }

}
