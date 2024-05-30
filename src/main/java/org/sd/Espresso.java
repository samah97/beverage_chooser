package org.sd;

public class Espresso extends Beverage{

    public Espresso(){
        super("Espresso");
    }

    @Override
    public double cost() {
        return .9;
    }
}
