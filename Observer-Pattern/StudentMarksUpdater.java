import java.util.ArrayList;

public class StudentMarksUpdater<T> implements Subject<T> {

    private ArrayList<Observer<T>> observers;

    public StudentMarksUpdater() {
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer<T> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer<T> o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(T msg) {
        for( Observer<T> obs : observers ) {
            obs.update(msg);
        }
    }
}
