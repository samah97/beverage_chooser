package org.sd;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        super("House Blend");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
