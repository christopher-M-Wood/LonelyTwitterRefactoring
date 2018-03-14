package ca.ualberta.cs.lonelytwitter;

/**
 * Created by critt on 2018-03-14.
 */

public class NormalLonelyTweet extends LonelyTweet {

    public NormalLonelyTweet(){
        super();
    }

    public NormalLonelyTweet(String text){
        super(text);
    }

    @Override
    public String getTweetBody(){
        return this.tweetBody;
    }
}
