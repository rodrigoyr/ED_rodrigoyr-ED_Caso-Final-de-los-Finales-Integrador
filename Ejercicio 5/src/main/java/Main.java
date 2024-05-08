import model.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        try {
            UserAccount sender = new UserAccount("Sender", "sender@example.com");
            UserAccount recipient = new UserAccount("Recipient", "recipient@example.com");

            Tweet tweet = new Tweet(sender, "This is a tweet");
            System.out.println(tweet);

            Retweet retweet = new Retweet(sender, "This is a retweet", tweet);
            System.out.println(retweet);

            DirectMessage directMessage = new DirectMessage(sender, "This is a direct message", recipient);
            System.out.println(directMessage);
        } catch (TweetTooLongException | InvalidEmailException | InvalidAliasException e) {
            e.printStackTrace();
        }
    }
}