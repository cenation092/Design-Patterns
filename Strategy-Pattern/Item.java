public class Item {

    private String uCode;
    private int price;

    public Item(String uCode, int price) {
        this.uCode = uCode;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getUCode() {
        return uCode;
    }
}
