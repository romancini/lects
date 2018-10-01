package br.com.romancini.lects.services;

import br.com.romancini.lects.dto.LessonSync;
import retrofit2.Call;
import retrofit2.http.GET;

public interface LessonService {
    @GET("v1/lessons/")
    Call<LessonSync> list();
}
