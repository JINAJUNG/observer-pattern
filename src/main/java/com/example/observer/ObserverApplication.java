package com.example.observer;

public class ObserverApplication {
    public static void main(String[] args) throws InterruptedException {
        Channel channel = new Channel("죠르디TV");
        SubscriberAlertObserver observerOne = new SubscriberAlertObserver("banana", channel);
        SubscriberAlertObserver observerTwo = new SubscriberAlertObserver("mango", channel);
        SubscriberAlertObserver observerThree = new SubscriberAlertObserver("orange", channel);
        for(int i=0;i<5;i++){
            Video video = new Video();
            video.setTitle((i+1)+"번째 영상");
            channel.addVideo(video);
            Thread.sleep(3000L);
        }
    }
}
