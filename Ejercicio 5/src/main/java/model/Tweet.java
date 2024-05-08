package model;

import exceptions.TweetTooLongException;

import java.time.LocalDate;

public class Tweet {
    private UserAccount sender;
    private String message;
    private LocalDate time;

    public Tweet(UserAccount sender, String message) {
        if (message.length() > 140) {
            throw new TweetTooLongException("Message is too long");
        }
        this.sender = sender;
        this.message = message;
        this.time = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "sender=" + sender +
                ", message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}