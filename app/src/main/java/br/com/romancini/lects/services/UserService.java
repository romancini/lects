package br.com.romancini.lects.services;

import br.com.romancini.lects.dto.UserSync;
import br.com.romancini.lects.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {
    @POST("v1/authenticate/")
    Call<UserSync> login(@Body User user);
}
