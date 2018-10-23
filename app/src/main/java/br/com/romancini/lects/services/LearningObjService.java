package br.com.romancini.lects.services;

import br.com.romancini.lects.model.LearningObj;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LearningObjService {
    @GET("v1/learningObj/")
    Call<LearningObj> list();

    @GET("v1/learningObj/{Id}")
    Call<LearningObj> listById(@Path("id") String learningObjId);
}
