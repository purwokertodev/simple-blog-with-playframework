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
public class Comment extends Model {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    private String commentatorName;
    private Date commentDate;
    private String commentContent;

    public static Finder<Integer, Comment> find = new Finder<Integer, Comment>(Integer.class, Comment.class);

    public static List<Comment> findCommentByPost(Post p){
        return find.where().eq("post", p).orderBy("commentDate DESC").findList();
    }

    public static Comment create(Comment c, Integer postId){
        Post posting = Post.find.ref(postId);
        c.setPost(posting);
        c.save();
        return c;
    }

    public Comment(){

    }

    public Comment(Post post){
        this.post = post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getCommentatorName() {
        return commentatorName;
    }

    public void setCommentatorName(String commentatorName) {
        this.commentatorName = commentatorName;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
