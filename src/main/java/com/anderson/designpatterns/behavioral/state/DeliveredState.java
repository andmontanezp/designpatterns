package com.anderson.designpatterns.behavioral.state;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }

    @Override
    public String toString() {
        return "DeliveredState{}";
    }
}
