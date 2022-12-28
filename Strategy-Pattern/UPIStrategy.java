public class UPIStrategy implements PaymentStrategy {

    private String upiId;
    private String upiPin;

    public UPIStrategy(String upiId, String upiPin) {
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using UPI.");
    }
}
