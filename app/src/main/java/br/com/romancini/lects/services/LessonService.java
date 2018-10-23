package br.com.romancini.lects.services;

import br.com.romancini.lects.model.Lesson;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface LessonService {
    @GET("v1/lessons/")
    Call<Lesson> list(
            @Header("x-access-token") String token
    );
}
