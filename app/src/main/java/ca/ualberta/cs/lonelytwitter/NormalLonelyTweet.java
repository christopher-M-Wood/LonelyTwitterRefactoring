package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by critt on 2018-03-14.
 */

public class NormalLonelyTweet extends LonelyTweet {

    public NormalLonelyTweet(){
        super();
    }

    public NormalLonelyTweet(String text, Date date){
        super(text,date);
    }

    @Override
    public String getTweetBody(){
        return this.tweetBody;
    }
}
