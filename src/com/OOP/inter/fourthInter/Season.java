package com.OOP.inter.fourthInter;

public enum Season {

    Summer("+20"){
        @Override
        public String getDescription() {
            return "Warm period";
        }
    },
    Autumn("+5"),
    Winter("-4"),
    Spring("+10");

    Season(String temperature){
    }

    public String getDescription(){
        return "Cold period";
    }

}
