package br.com.romancini.lects.retrofit;

import br.com.romancini.lects.services.UserService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitInicializer {

    private final Retrofit retrofit;

    public RetrofitInicializer() {
        retrofit = new Retrofit.Builder()
                //.baseUrl("https://lects.herokuapp.com/")
                .baseUrl("http://10.0.2.2:3000/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public UserService userService(){
        return retrofit.create(UserService.class);
    }
}
