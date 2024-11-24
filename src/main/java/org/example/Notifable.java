package org.example;

public interface Notifable {
    void addObserver(Runnable observer);
    void removeObserver(Runnable observer);
    void notifyObservers();
}
