public interface Subject<T> {

    public void addObserver(Observer<T> o);
    public void removeObserver(Observer<T> o);
    public void notifyObserver(T msg);
}
