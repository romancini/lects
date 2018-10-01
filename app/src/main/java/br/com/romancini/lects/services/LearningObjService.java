package br.com.romancini.lects.services;

import br.com.romancini.lects.dto.LearningObjSync;
import retrofit2.Call;
import retrofit2.http.GET;

public interface LearningObjService {
    @GET("v1/lessons/")
    Call<LearningObjSync> list();
}
