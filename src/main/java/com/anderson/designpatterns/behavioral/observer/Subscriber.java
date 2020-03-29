package com.anderson.designpatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer<List<Post>> {
    List<Post> posts;

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(List<Post> posts) {
        this.posts = posts;
        System.out.println(String.format("Posts update received from Subscriber %s %s", name, posts));
    }
}
