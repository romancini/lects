package br.com.romancini.lects.services;

import br.com.romancini.lects.dto.LearningObjSync;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LearningObjService {
    @GET("v1/learningObj/")
    Call<LearningObjSync> list();

    @GET("v1/learningObj/{Id}")
    Call<LearningObjSync> listById(@Path("id") String learningObjId);
}
