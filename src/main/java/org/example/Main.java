package org.example;

public class Main {
    public static void main(String[] args) {
        Notifable notifable = new StringStateNotifier();
        ObservableStringBuilder osb = new ObservableStringBuilder(notifable);

        notifable.addObserver(() -> System.out.println("Состояние изменилось!"));
        notifable.addObserver(() -> System.out.println("Текущее состояние: " + osb));

        osb.append("Hello").append(", World!");
    }
}