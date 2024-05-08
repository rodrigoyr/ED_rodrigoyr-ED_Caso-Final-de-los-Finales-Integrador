import model.*;
import exceptions.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static UserAccount currentUser;

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Twitter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        // Create the buttons
        JButton createUserButton = new JButton("Create UserAccount");
        createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alias = JOptionPane.showInputDialog(frame, "Enter alias:");
                String email = JOptionPane.showInputDialog(frame, "Enter email:");
                try {
                    currentUser = new UserAccount(alias, email);
                    JOptionPane.showMessageDialog(frame, "UserAccount created successfully");
                } catch (InvalidEmailException | InvalidAliasException ex) {
                    JOptionPane.showMessageDialog(frame, "Error creating UserAccount: " + ex.getMessage());
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

        // Add the buttons to the panel
        panel.add(createUserButton);
        panel.add(tweetButton);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Show the frame
        frame.setVisible(true);
    }
}