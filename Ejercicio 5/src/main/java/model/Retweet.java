package model;

import exceptions.TweetTooLongException;

public class Retweet extends Tweet {
    private Tweet originalTweet;

    public Retweet(UserAccount sender, String message, Tweet originalTweet) throws TweetTooLongException {
        super(sender, message);
        this.originalTweet = originalTweet;
    }

    public Tweet getOriginalTweet() {
        return originalTweet;
    }

    @Override
    public String toString() {
        return "Retweet{" +
                "originalTweet=" + originalTweet +
                ", sender=" + getSender() +
                ", message='" + getMessage() + '\'' +
                ", time=" + getTime() +
                '}';
    }
}