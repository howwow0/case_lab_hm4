package org.example;

class ObservableStringBuilder {
    private final StringBuilder stringBuilder;
    private final Notifable notifable;

    public ObservableStringBuilder(Notifable notifable) {
        this.stringBuilder = new StringBuilder();
        this.notifable = notifable;
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifable.notifyObservers();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}