package observer_pattern.observer;

import observer_pattern.observable.Observable;

public interface Observer {
    public void update(Observable o);
}
