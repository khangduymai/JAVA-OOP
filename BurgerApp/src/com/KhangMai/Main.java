package com.KhangMai;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger basicBurger = new Burger("Basic Burger","white", "Beef",2.50);

        basicBurger.addOption1("salad", 0.50);
        basicBurger.addOption2("onion", 0.25);
        basicBurger.addOption3("tomato", 0.50);
        basicBurger.addOption4("cheese", 0.50);

        System.out.println("Total price: $" + basicBurger.finalizeItems());

        System.out.println();

        DeluxeBurger db = new DeluxeBurger();
        db.addOption1("candy", 1.00);
        System.out.println("Total price: $" + db.finalizeItems());
    }
}
