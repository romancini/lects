package br.com.romancini.lects.model;

public class User {
    private String login;

    public User(String login){
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
