package com.anderson.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlogSystem implements Observable<Subscriber, Post> {
    private List<Post> posts = new ArrayList<>();
    private List<Subscriber> subscribers = new ArrayList<>();


    @Override
    public void addObservers(Subscriber... subscriber) {
        this.subscribers.addAll(Arrays.asList(subscriber));
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void emit(Post post) {
        this.posts.add(post);
        subscribers.forEach(subscriber -> subscriber.update(posts));
    }
}
