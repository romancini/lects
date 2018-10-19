package br.com.romancini.lects.model;

import br.com.romancini.lects.model.types.UserType;

public class User {
    private String _id;
    private String login;
    private UserType userType;
    private String userClass;

    public User() {
        super();
    }

    public User(String id, String login, UserType userType, String userClass) {
        this._id = id;
        this.login = login;
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

    public String get_id() {
        return _id;
    }
}
