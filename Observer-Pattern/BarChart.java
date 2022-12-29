public class BarChart<T> implements Observer<T> {
    @Override
    public void update(T data) {
        System.out.println("Updated barchart with new values" + data.toString());
    }
}
