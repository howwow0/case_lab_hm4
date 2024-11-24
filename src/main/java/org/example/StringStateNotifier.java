package org.example;

import java.util.ArrayList;
import java.util.List;

class StringStateNotifier implements Notifable {
    private final List<Runnable> observers = new ArrayList<>();

    @Override
    public void addObserver(Runnable observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Runnable observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Runnable observer : observers) {
            observer.run();
        }
    }
}