package blog2.v1.tweeter.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tweet_post")
public class TweetPost {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private long postId;

    @Column(name = "posters_name")
    private String postersName;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "post_likes")
    private int postLikes;

    @Column(name = "post_date")
    private Date postDate;

    public TweetPost(){}

    public TweetPost(long postId, String postersName, String postContent, int postLikes, Date postDate) {
        this.postId = postId;
        this.postersName = postersName;
        this.postContent = postContent;
        this.postLikes = postLikes;
        this.postDate = postDate;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostersName() {
        return postersName;
    }

    public void setPostersName(String postersName) {
        this.postersName = postersName;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(int postLikes) {
        this.postLikes = postLikes;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
