package br.com.romancini.lects.retrofit;

import br.com.romancini.lects.services.LessonService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitInicializer {

    private final Retrofit retrofit;

    public RetrofitInicializer() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://lects.herokuapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public LessonService getLessonService(){
        return retrofit.create(LessonService.class);
    }
}
