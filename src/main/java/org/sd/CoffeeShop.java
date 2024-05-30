package org.sd;


import org.sd.add_ons.MilkAddOn;
import org.sd.add_ons.MochaAddOn;
import org.sd.add_ons.SoyAddOn;
import org.sd.add_ons.WhippedCreamAddOn;

import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.start();
    }

    public void start(){
        Beverage beverage = chooseCoffee();
        beverage = chooseAddOns(beverage);
        printReceipt(beverage);
    }

    private Beverage chooseCoffee() {
        int coffeeChoice =-1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                Please choose your preferred type of Coffee:
                1- House Blend
                2- Decaf
                3- Dark
                4- Espresso
                
                Your Choice:  """);
            while (!scanner.hasNextInt()) {
                System.out.println("Your choice must be a number from the above, choose again please");
                scanner.next();
            }
            coffeeChoice = scanner.nextInt();
        } while (coffeeChoice <= 0 || coffeeChoice > 4);

        return switch (coffeeChoice) {
            case 1 -> new HouseBlend();
            case 2 -> new Decaf();
            case 3 -> new Dark();
            default -> new Espresso();
        };
    }

    private Beverage chooseAddOns(Beverage beverage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add Soy on it? (Y/n) ");
        if ("Y".equalsIgnoreCase(scanner.nextLine())) {
            beverage = new SoyAddOn(beverage);
        }
        System.out.println("What about Mocha? (Y/n) ");
        if ("Y".equalsIgnoreCase(scanner.nextLine())) {
            beverage = new MochaAddOn(beverage);
        }
        System.out.println("Milk? (Y/n) ");
        if ("Y".equalsIgnoreCase(scanner.nextLine())) {
            beverage = new MilkAddOn(beverage);
        }
        System.out.println("Whipped Cream? (Y/n) ");
        if ("Y".equalsIgnoreCase(scanner.nextLine())) {
            beverage = new WhippedCreamAddOn(beverage);
        }
        return beverage;
    }

    private void printReceipt(Beverage beverage) {
        System.out.println("Perfect choice of coffee!");
        System.out.println("Here's your receipt: " + beverage.getDescription() + " and the cost is: $" + beverage.cost());
    }
}

