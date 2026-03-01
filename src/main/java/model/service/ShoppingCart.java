package model.service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            total = total + item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double price = item.getPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }

            double priceWithDiscount = price * (1 - discount / 100);
            total = total + item.getAmount() * priceWithDiscount;
        }
        return total;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            if (item.isVegetarian()) {
                total = total + item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
