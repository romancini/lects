package br.com.romancini.lects.services;

import br.com.romancini.lects.model.Login;
import br.com.romancini.lects.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {
    @POST("authenticate")
    Call<User> login(@Body Login login);
}
