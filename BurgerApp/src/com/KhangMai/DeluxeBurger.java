package com.KhangMai;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 5.00);
        super.addOption1("Chip", 1.75);
        super.addOption2("drink", 1.50);
    }

    @Override
    public void addOption1(String addOn1, double priceAddOn1) {
        System.out.println("Cannot add items in Deluxe Burger");
    }

    @Override
    public void addOption2(String addOn2, double priceAddOn2) {
        System.out.println("Cannot add items in Deluxe Burger");
    }

    @Override
    public void addOption3(String addOn3, double priceAddOn3) {
        System.out.println("Cannot add items in Deluxe Burger");
    }

    @Override
    public void addOption4(String addOn4, double priceAddOn4) {
        System.out.println("Cannot add items in Deluxe Burger");
    }
}
