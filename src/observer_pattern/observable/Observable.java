package observer_pattern.observable;

import observer_pattern.observer.Observer;

public interface Observable {
    public void addObserver(Observer o);
    public void removeObsever(Observer o);
    public void notifyObservers();

}
