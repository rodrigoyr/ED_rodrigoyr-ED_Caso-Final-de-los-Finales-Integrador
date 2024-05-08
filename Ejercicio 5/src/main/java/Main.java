
import model.*;
import exceptions.TweetTooLongException;

public class Main {
    public static void main(String[] args) {
        try {
            UserAccount sender = new UserAccount("Sender");
            UserAccount recipient = new UserAccount("Recipient");

            Tweet tweet = new Tweet(sender, "This is a tweet");
            System.out.println(tweet);

            Retweet retweet = new Retweet(sender, "This is a retweet", tweet);
            System.out.println(retweet);

            DirectMessage directMessage = new DirectMessage(sender, "This is a direct message", recipient);
            System.out.println(directMessage);
        } catch (TweetTooLongException e) {
            e.printStackTrace();
        }
    }
}
