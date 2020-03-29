package com.anderson.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        BlogSystem blogSystem = new BlogSystem();
        Subscriber s = new Subscriber("Kenny");
        Subscriber s2 = new Subscriber("Anderson");
        Subscriber s3 = new Subscriber("Claudio");

        blogSystem.addObservers(s, s2, s3);
        blogSystem.emit(new Post("Design patterns"));
        System.out.println("====================================================");
        blogSystem.emit(new Post("Airlines"));
        System.out.println("====================================================");
        blogSystem.removeObserver(s);
        System.out.println("====================================================");
        blogSystem.emit(new Post("How to do in Java"));


    }
}
