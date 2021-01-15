package com.example.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private final List<Observer> observers;

    private String name;
    private final List<Video> videos;
    private final LocalDateTime createDate;

    public Channel(String name) {
        this.name = name;
        observers = new ArrayList<>();
        videos = new ArrayList<>();
        createDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void addVideo(Video v){
        videos.add(v);
        notifyObserver(v);
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(Video video) {
        for(Observer o : observers){
            o.update(name, video);
        }
    }
}
