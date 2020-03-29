package com.anderson.designpatterns.behavioral.memento;

public interface Originator<T> {
    T save();
    void restore(T t);
}
