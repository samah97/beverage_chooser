package org.sd;

public class Dark extends Beverage{

    public Dark(){
        super("Dark");
    }

    @Override
    public double cost() {
        return 1.3;
    }
}
