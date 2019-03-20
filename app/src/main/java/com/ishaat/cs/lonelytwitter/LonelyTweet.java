package com.ishaat.cs.lonelytwitter;

public class LonelyTweet extends Tweet {
    public static final int MAX_TWEET_BODY_LENGTH = 20;

    @Override
    public boolean isBodyValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > MAX_TWEET_BODY_LENGTH) {
            return false;
        }

        return true;
    }
}
