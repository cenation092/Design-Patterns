public class PiChart<T> implements Observer<T> {
    @Override
    public void update(T data) {
        System.out.println("Updated pichart with new values" + data.toString());
    }
}
