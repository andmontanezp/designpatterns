package com.anderson.designpatterns.behavioral.state;

public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void previous(Package pkg) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }

    @Override
    public String toString() {
        return "OrderedState{}";
    }
}
