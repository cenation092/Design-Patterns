public class ShoppingCardTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        cart.addItem(item1);
        cart.addItem(item2);

        // pay by PayPal
        cart.pay(new PaypalStrategy("cenation092@gmail.com", "1234"));

        // pay by upi id
        cart.pay(new UPIStrategy("cenation092", "1234"));
    }
}
