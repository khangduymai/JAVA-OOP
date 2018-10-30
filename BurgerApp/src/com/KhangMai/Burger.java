package com.KhangMai;

public class Burger {

    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String addOn1;
    private double priceAddOn1;
    private String addOn2;
    private double priceAddOn2;
    private String addOn3;
    private double priceAddOn3;
    private String addOn4;
    private double priceAddOn4;

    public Burger(String name, String breadType, String meat, double price){
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addOption1(String addOn1, double priceAddOn1){
        this.addOn1 = addOn1;
        this.priceAddOn1 = priceAddOn1;
    }

    public void addOption2(String addOn2, double priceAddOn2){
        this.addOn2 = addOn2;
        this.priceAddOn2 = priceAddOn2;
    }

    public void addOption3(String addOn3, double priceAddOn3){
        this.addOn3 = addOn3;
        this.priceAddOn3 = priceAddOn3;
    }

    public void addOption4(String addOn4, double priceAddOn4){
        this.addOn4 = addOn4;
        this.priceAddOn4 = priceAddOn4;
    }


    public double finalizeItems(){
        double burgerPrice = this.price;
        //this show the basic burger price before all of the additions
        System.out.println(this.name + " hamburger on a " + this.breadType + " bun with the meat is " +
                            this.meat + ". The basic price is: " + this.price);

        if(this.addOn1 != null){
            burgerPrice += priceAddOn1;
            System.out.println("Add " + this.addOn1 + " with extra price: $" + this.priceAddOn1);
        }
        if(this.addOn2 != null){
            burgerPrice += priceAddOn2;
            System.out.println("Add " + this.addOn2 + " with extra price: $" + this.priceAddOn2);
        }
        if(this.addOn3 != null){
            burgerPrice += priceAddOn3;
            System.out.println("Add " + this.addOn3 + " with extra price: $" + this.priceAddOn3);
        }
        if(this.addOn4 != null){
            burgerPrice += priceAddOn4;
            System.out.println("Add " + this.addOn4 + " with extra price: $" + this.priceAddOn4);
        }

        return burgerPrice;

    }
}
