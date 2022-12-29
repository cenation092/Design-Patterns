public interface Subject<T> {

    void addObserver(Observer<T> o);
    void removeObserver(Observer<T> o);
    void notifyObserver(T msg);
}
