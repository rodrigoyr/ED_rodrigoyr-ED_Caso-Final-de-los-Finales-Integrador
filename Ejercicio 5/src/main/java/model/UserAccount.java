package model;

import exceptions.InvalidAliasException;
import exceptions.InvalidEmailException;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;
    private List<Tweet> timeline;
    private List<UserAccount> followers;
    private List<UserAccount> following;

    public UserAccount(String alias, String email) throws InvalidEmailException, InvalidAliasException {
        if (!Utils.isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email");
        }
        if (!Utils.isValidAlias(alias)) {
            throw new InvalidAliasException("Invalid alias");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.timeline = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public void follow(UserAccount user) {
        if (this.following.contains(user)) {
            throw new IllegalArgumentException("You are already following this user");
        }
        this.following.add(user);
        user.followers.add(this);
    }

    public void tweet(Tweet tweet) {
        this.tweets.add(tweet);
        for (UserAccount follower : this.followers) {
            follower.timeline.add(tweet);
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}