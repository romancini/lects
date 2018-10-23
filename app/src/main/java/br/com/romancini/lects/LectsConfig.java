package br.com.romancini.lects;

import android.app.Application;

public class LectsConfig extends Application {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
