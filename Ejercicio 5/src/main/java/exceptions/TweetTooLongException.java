package exceptions;

public class TweetTooLongException extends Exception {
    public TweetTooLongException(String message) {
        super(message);
    }
}