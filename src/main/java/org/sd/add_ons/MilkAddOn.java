package org.sd.add_ons;


import org.sd.Beverage;
import org.sd.BeverageAddOn;

public class MilkAddOn extends BeverageAddOn {


    public MilkAddOn(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .5+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
