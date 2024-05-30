package org.sd.add_ons;

import org.sd.Beverage;
import org.sd.BeverageAddOn;

public class SoyAddOn extends BeverageAddOn {


    public SoyAddOn(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .15+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
