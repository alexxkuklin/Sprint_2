package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return Discount.NO_DISCOUNT;
    }
}
