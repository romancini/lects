package br.com.romancini.lects.retrofit;

import br.com.romancini.lects.services.LearningObjService;
import br.com.romancini.lects.services.LessonService;
import br.com.romancini.lects.services.UserService;
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

    public UserService getToken(){
        return retrofit.create(UserService.class);
    }

    public LessonService getLessonService(){
        return retrofit.create(LessonService.class);
    }

    public LearningObjService getLearningObjService(){
        return retrofit.create(LearningObjService.class);
    }
}
