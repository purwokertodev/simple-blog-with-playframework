package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.Expression;

/**
 * Created by WURI on 23/02/2016.
 */
@Entity
public class Author extends Model{

    @Id
    private Integer id;
    private String authorName;
    private String email;
    private String website;
    private String password;

    public static Finder<Integer, Author> find = new Finder<Integer, Author>(Integer.class, Author.class);

    public static Author authenticate(String email, String password){
        Author a = find.where().eq("email", email).eq("password", password).findUnique();
        return a;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
