package com.OOP.inter.fifthInter;

public class Main {
    public static void main(String[] args) {

        Clothes[] clothes = new Clothes[5];

        clothes[0] = new Pants(Sizes.S, 8, "red");
        clothes[1] = new Skirt(Sizes.L, 6.5, "black");
        clothes[2] = new Tie(Sizes.M, 2.4, "pink");
        clothes[3] = new Tshirt(Sizes.XS, 4.6, "wight");
        clothes[4] = new Pants(Sizes.XXS, 5.3, "blue");

        for(Sizes size : Sizes.values()){
            System.out.println(size + " - " + size.getDescription());
        }

        Studio studio = new Studio();
        studio.dressMen(clothes);
        System.out.println("--------");
        studio.dressWomen(clothes);
    }
}
