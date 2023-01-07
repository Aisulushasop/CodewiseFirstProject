package esenPractice;

import javax.xml.stream.events.Comment;

public class YoutubeVideo {

    //instance variables
    String title;
    String comments;
    int views;
    int likes;
    boolean isPrivate;

    public void watch(){
        views++;// views = views = 1;
    }
    public void likes(){
        likes++;
    }
public void comment( String newComment){
    comments = comments+ " " + newComment;
}









}
