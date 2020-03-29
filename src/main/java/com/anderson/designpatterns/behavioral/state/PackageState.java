package com.anderson.designpatterns.behavioral.state;

public interface PackageState {
    void next(Package pkg);
    void previous(Package pkg);
    void printStatus();
}
