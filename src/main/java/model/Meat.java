package model;

import model.constants.Discount;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {

        return Discount.NO_DISCOUNT;
    }
}
