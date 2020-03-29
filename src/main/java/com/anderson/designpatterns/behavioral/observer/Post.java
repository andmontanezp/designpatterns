package com.anderson.designpatterns.behavioral.observer;

public class Post {
    private String title;

    public Post(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
