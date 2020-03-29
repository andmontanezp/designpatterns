package com.anderson.designpatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Package pkt = new Package();
        pkt.printStatus();
        pkt.nextState();
        pkt.printStatus();
        pkt.nextState();
        pkt.printStatus();
        pkt.nextState();
        pkt.printStatus();
    }
}
