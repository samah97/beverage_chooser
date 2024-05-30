package org.sd;

public abstract class BeverageAddOn extends Beverage{

    protected Beverage beverage;

    protected BeverageAddOn(Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
    }


    @Override
    public abstract String getDescription();
}
