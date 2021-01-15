package com.example.observer;

import java.time.LocalDateTime;

public class Video {
    private Integer no;
    private String title;
    private Boolean status;
    private final LocalDateTime uploadDate;

    public Video() {
        uploadDate = LocalDateTime.now();
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }
}
