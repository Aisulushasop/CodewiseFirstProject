package esenPractice;

public class Platform {

    public static void main (String [] args){
        YoutubeVideo video = new YoutubeVideo();
        System.out.println(video.views);
        video.watch();
        video.watch();
        video.watch();
        video.comment( "Hey great video");
        video.comment( "Nah,its lame ");

        System.out.println( video.comments);
        System.out.println(video.views);
        System.out.println( video.likes);






    }


}