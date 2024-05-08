import model.*;
import exceptions.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Twitter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create the button
        JButton button = new JButton("Create UserAccount");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UserAccount user = new UserAccount("Alias", "email@example.com");
                    System.out.println(user);
                } catch (InvalidEmailException | InvalidAliasException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);

        // Show the frame
        frame.setVisible(true);
    }
}