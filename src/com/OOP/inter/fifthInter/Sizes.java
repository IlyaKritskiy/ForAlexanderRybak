package com.OOP.inter.fifthInter;

public enum Sizes {
    XS(34){
        @Override
        public String getDescription() {
            return "Child size";
        }
    },
    S(36),
    M(38),
    L(40),
    XXS(32);

    private int i;

    Sizes(int i) {
        this.i = i;
    }

    public String getDescription(){
        return "Adult size";
    }

}



