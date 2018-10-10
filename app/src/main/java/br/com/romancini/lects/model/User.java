package br.com.romancini.lects.model;

import br.com.romancini.lects.model.types.UserType;

public class User {
    private String login;
    private String password;
    private UserType userType;
    private String userClass;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, UserType userType, String userClass) {
        this.login = login;
        this.password = password;
        this.userType = userType;
        this.userClass = userClass;
    }

    public String getLogin() {
        return login;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getUserClass() {
        return userClass;
    }
}
