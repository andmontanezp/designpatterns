package com.anderson.designpatterns.behavioral.state;

public class Package {

    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }

    public void previousState() {
        this.state.previous(this);
    }

    public void nextState() {
        this.state.next(this);
    }

    public void printStatus() {
        this.state.printStatus();
    }
}
