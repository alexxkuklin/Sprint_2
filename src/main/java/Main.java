import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, "red");
        Apple greenApple = new Apple(8, 60.0, "green");

        Food[] products = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " +
                cart.getTotalWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " +
                cart.getTotalWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " +
                cart.getVegetarianTotalWithoutDiscount() + " руб.");
    }
}
