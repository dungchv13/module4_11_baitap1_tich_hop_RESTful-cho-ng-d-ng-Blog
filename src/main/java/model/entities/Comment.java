package model.entities;

import javax.persistence.*;

@Entity

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int ratting;
    private String author;
    private String feedBack;
    private int likes;

    public Comment() {
        this.likes = 0;
    }

    public Comment(int ratting, String author, String feedBack) {
        this.ratting = ratting;
        this.author = author;
        this.feedBack = feedBack;
        this.likes = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRatting() {
        return ratting;
    }

    public void setRatting(int ratting) {
        this.ratting = ratting;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
