package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

/**
 * Created by WURI on 23/02/2016.
 */
@Entity
public class Post extends Model {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private Date postingDate;
    private String postTitle;
    private String postContent;

    public static Finder<Integer, Post> find = new Finder<Integer, Post>(Integer.class, Post.class);

    public static Post create(Post p, Integer authorId){
        Author a = Author.find.ref(authorId);
        p.setAuthor(a);
        return p;
    }

    public static List<Post> findByAuthor(Author a){
        return find.where().eq("author", a).orderBy("postingDate DESC").findList();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}
