package model;

public class Retweet extends Tweet {
    private Tweet originalTweet;

    public Retweet(UserAccount sender, String message, Tweet originalTweet) {
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
                ", sender=" + sender +
                ", message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}