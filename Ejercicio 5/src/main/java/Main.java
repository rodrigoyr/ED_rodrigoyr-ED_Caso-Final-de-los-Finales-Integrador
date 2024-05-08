import model.*;
import exceptions.*;

import javax.swing.*;
import model.*;
import exceptions.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static UserAccount currentUser;
    private static List<UserAccount> users = new ArrayList<>();

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Twitter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));
        panel.setBackground(Color.BLUE);  // Set the background color to blue

        // Create the buttons
        JButton createUserButton = new JButton("Create UserAccount");
        createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alias = JOptionPane.showInputDialog(frame, "Enter alias:");
                String email = JOptionPane.showInputDialog(frame, "Enter email:");
                try {
                    currentUser = new UserAccount(alias, email);
                    users.add(currentUser);
                    JOptionPane.showMessageDialog(frame, "UserAccount created successfully");
                } catch (InvalidEmailException | InvalidAliasException ex) {
                    JOptionPane.showMessageDialog(frame, "Error creating UserAccount: " + ex.getMessage());
                }
            }
        });

        JButton followButton = new JButton("Follow User");
        followButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alias = JOptionPane.showInputDialog(frame, "Enter alias of user to follow:");
                UserAccount userToFollow = users.stream()
                        .filter(user -> user.getAlias().equals(alias))
                        .findFirst()
                        .orElse(null);
                if (userToFollow != null) {
                    currentUser.follow(userToFollow);
                    JOptionPane.showMessageDialog(frame, "You are now following " + alias);
                } else {
                    JOptionPane.showMessageDialog(frame, "User not found");
                }
            }
        });

        JButton tweetButton = new JButton("Tweet");
        tweetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = JOptionPane.showInputDialog(frame, "Enter tweet:");
                try {
                    Tweet tweet = new Tweet(currentUser, message);
                    currentUser.tweet(tweet);
                    JOptionPane.showMessageDialog(frame, "Tweet sent successfully");
                } catch (TweetTooLongException ex) {
                    JOptionPane.showMessageDialog(frame, "Error sending tweet: " + ex.getMessage());
                }
            }
        });

        JButton retweetButton = new JButton("Retweet");
        retweetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This is a simplified version. In a real application, you would want to let the user choose which tweet to retweet.
                if (!currentUser.getTimeline().isEmpty()) {
                    Tweet tweetToRetweet = currentUser.getTimeline().get(0);
                    try {
                        Retweet retweet = new Retweet(currentUser, "Retweet", tweetToRetweet);
                        currentUser.tweet(retweet);
                        JOptionPane.showMessageDialog(frame, "Retweet sent successfully");
                    } catch (TweetTooLongException ex) {
                        JOptionPane.showMessageDialog(frame, "Error sending retweet: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "No tweets to retweet");
                }
            }
        });

        JButton directMessageButton = new JButton("Send Direct Message");
        directMessageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alias = JOptionPane.showInputDialog(frame, "Enter alias of user to send direct message:");
                UserAccount recipient = users.stream()
                        .filter(user -> user.getAlias().equals(alias))
                        .findFirst()
                        .orElse(null);
                if (recipient != null) {
                    String message = JOptionPane.showInputDialog(frame, "Enter message:");
                    try {
                        DirectMessage directMessage = new DirectMessage(currentUser, message, recipient);
                        currentUser.tweet(directMessage);
                        JOptionPane.showMessageDialog(frame, "Direct message sent successfully");
                    } catch (TweetTooLongException ex) {
                        JOptionPane.showMessageDialog(frame, "Error sending direct message: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "User not found");
                }
            }
        });

        // Add the buttons to the panel
        panel.add(createUserButton);
        panel.add(followButton);
        panel.add(tweetButton);
        panel.add(retweetButton);
        panel.add(directMessageButton);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Show the frame
        frame.setVisible(true);
    }
}