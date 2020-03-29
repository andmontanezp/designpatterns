package com.anderson.designpatterns.behavioral.observer;

public interface Observable<T extends Observer, S> {
    void addObservers(T... observer);
    void removeObserver(T observer);

    void emit(S s);
}
