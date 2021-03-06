package com.example.c4q.conscious.smart;

import com.example.c4q.conscious.smart.model.QODResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by c4q on 3/31/18.
 */

public interface QuotesByCategoryService {
    @GET("qod")
    Call<QODResponse>allCategories(@Query("category") String category);
}
