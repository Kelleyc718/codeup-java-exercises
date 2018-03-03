public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish pizza = new RestaurantDish("Pizza", 0.90, false);
        System.out.println(pizza.getNameOfDish());
        System.out.println(pizza.getCostInCents());
        System.out.println(pizza.isWouldRecommend());
        pizza.eat();
    }
}
