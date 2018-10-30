package com.KhangMai;

public class HealthyBurger extends Burger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown", meat, price);
    }

    public void addHealthy1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthy2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double finalizeItems() {
        double hamburgerPrice = super.finalizeItems();
        if(this.healthyExtra1Name != null){
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Add " + this.healthyExtra1Name + " with extra price: $"
                                + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Add " + this.healthyExtra2Name + " with extra price: $"
                    + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
