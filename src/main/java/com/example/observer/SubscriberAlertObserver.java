package com.example.observer;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SubscriberAlertObserver implements Observer {
    private String name;
    private final List<Video> noticeVideos;

    public SubscriberAlertObserver(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
        noticeVideos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String name, Video video) {
        noticeVideos.add(video);
        notice(name, video);
    }

    public void notice(String channelName, Video video) {
        System.out.println(name+"님 "+channelName+"님이 "+video.getTitle()+"을 업로드 했습니다.");
        System.out.println(video.getUploadDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    public void unfoldAlert(){
        for (Video v: noticeVideos){
            System.out.println(v.getTitle());
            System.out.println(v.getUploadDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    }
}
