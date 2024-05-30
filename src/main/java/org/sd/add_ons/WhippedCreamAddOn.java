package org.sd.add_ons;

import org.sd.Beverage;
import org.sd.BeverageAddOn;

public class WhippedCreamAddOn extends BeverageAddOn {


    public WhippedCreamAddOn(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .75+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whipped Cream";
    }
}
