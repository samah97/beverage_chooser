package org.sd.add_ons;

import org.sd.Beverage;
import org.sd.BeverageAddOn;

public class MochaAddOn extends BeverageAddOn {


    public MochaAddOn(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .25+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
