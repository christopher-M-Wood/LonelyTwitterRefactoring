package ca.ualberta.cs.lonelytweet;

import android.util.Log;

/**
 * Created by critt on 2018-03-14.
 */

public class ImportantLonelyTweet extends LonelyTweet {

    public ImportantLonelyTweet(){
        super();
    }

    public ImportantLonelyTweet(String text){
        super(text);
    }

    @Override
    public String getTweetBody(){
        return tweetBody.toUpperCase();
    }

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }
        return true;
    }

    public String toString() {
        String string = getTweetDate() + " | " + getTweetBody();
        Log.i("ImprotantLonelyTweet",string);
        return string;
    }
}
