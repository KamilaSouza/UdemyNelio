package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String tittle;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {

    }

    // we don't use set to list, generate add and remove methods
    public Post(Date moment, String tittle, String content, Integer likes) {
        this.moment = moment;
        this.tittle = tittle;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);

    }

    public List<Comment> getComments() {
        return comments;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tittle + "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(sdf.format(moment) + "\n");
        stringBuilder.append(content + "\n");
        stringBuilder.append("Comments:\n");
        for (Comment c : comments) {
            stringBuilder.append(c.getText() + "\n");
        }
        return stringBuilder.toString();
    }
}
