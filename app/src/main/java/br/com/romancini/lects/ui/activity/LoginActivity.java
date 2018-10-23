package br.com.romancini.lects.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.romancini.lects.LectsConfig;
import br.com.romancini.lects.R;
import br.com.romancini.lects.model.Login;
import br.com.romancini.lects.retrofit.RetrofitInicializer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    TextView email;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loadComponents();
        configureButton();

    }

    private void configureButton() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateLogin(email.getText().toString(), password.getText().toString());
            }
        });
    }

    private void loadComponents() {
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_login_button);
    }

    private void validateLogin(String email, String password) {
        Login login = new Login(email, password);
        Call call = new RetrofitInicializer().userService().login(login);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.isSuccessful()) {
                    storeTokenRecieved(response.headers().get(getString(R.string.TOKEN_HEADER_NAME)));
                    Intent intent = new Intent(LoginActivity.this, SelectLessonActivity.class);
                    startActivity(intent);
                } else {
                    Log.i(getString(R.string.LOGIN), getString(R.string.ALERT) + response.toString());
                    Toast.makeText(LoginActivity.this, R.string.VERIFY_EMAIL_PASS, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.e(getString(R.string.LOGIN), getString(R.string.ERROR) + t.toString());
                Toast.makeText(LoginActivity.this, R.string.REQUEST_ERROR, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void storeTokenRecieved(String token) {
        ((LectsConfig) this.getApplication()).setToken(token);
    }
}
