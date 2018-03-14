package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by critt on 2018-03-14.
 */

public class ImportantLonelyTweet extends LonelyTweet {
    
    public ImportantLonelyTweet(){
        super();
    }

    public ImportantLonelyTweet(String text, Date date){
        super(text,date);
    }

    @Override
    public String getTweetBody(){
        return this.tweetBody.toUpperCase();
    }
}
