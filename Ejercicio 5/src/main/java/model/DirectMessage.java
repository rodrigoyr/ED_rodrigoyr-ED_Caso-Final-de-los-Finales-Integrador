package model;

import exceptions.TweetTooLongException;

public class DirectMessage extends Tweet {
    private UserAccount recipient;

    public DirectMessage(UserAccount sender, String message, UserAccount recipient) throws TweetTooLongException {
        super(sender, message);
        this.recipient = recipient;
    }

    public UserAccount getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "recipient=" + recipient +
                ", sender=" + getSender() +
                ", message='" + getMessage() + '\'' +
                ", time=" + getTime() +
                '}';
    }
}