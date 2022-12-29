public class SpreadSheet<T> implements Observer<T>{
    @Override
    public void update(T data) {
        System.out.println("Updated spreadsheet with new values" + data.toString());
    }
}
