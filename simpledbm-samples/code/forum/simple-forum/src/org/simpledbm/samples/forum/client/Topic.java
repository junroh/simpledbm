package org.simpledbm.samples.forum.client;

import java.io.Serializable;

/**
 * A Topic represents the title of a thread of conversation. 
 * A forum can have many topics.
 * Each topic can have multiple posts.
 */
@SuppressWarnings("serial")
public class Topic implements Serializable {
    String title = "test";
    String lastPost = "10:00";
    String numPosts = "10";
    String startedBy = "anonymous";
    String lastPoster = "anonymous";
    public boolean read;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastPost() {
        return lastPost;
    }

    public void setLastPost(String lastPost) {
        this.lastPost = lastPost;
    }

    public String getNumPosts() {
        return numPosts;
    }

    public void setNumPosts(String numPosts) {
        this.numPosts = numPosts;
    }

    public String getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    public String getLastPoster() {
        return lastPoster;
    }

    public void setLastPoster(String lastPoster) {
        this.lastPoster = lastPoster;
    }

}
