package com.example.c4q.conscious.backend;

import android.util.Log;

import com.example.c4q.conscious.model.QODResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by c4q on 3/29/18.
 */

public class RetrofitFactory {

   private static RetrofitFactory retrofitFactory;
   private Retrofit retrofit;
   private QuotesApiListener quotesApiListener;


   public static RetrofitFactory getInstance(){
       if(retrofitFactory==null){
           retrofitFactory = new RetrofitFactory();
       }
       return retrofitFactory;
   }

   public void setQuotesApiListener(QuotesApiListener quotesApiListener){
       this.quotesApiListener = quotesApiListener;
   }

   private Retrofit buildRetrofit(){
       if(retrofit == null){
           retrofit = new Retrofit.Builder()
                   .baseUrl(Host.BASEURL_THEY_SAID_SO.getUrl())
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit;
   }


    public void getCategories(String category){
       QuotesByCategoryService quotesByCategory = buildRetrofit().create(QuotesByCategoryService.class);
       Call<QODResponse>serviceResponse = quotesByCategory.allCategories(category);
       serviceResponse.enqueue(new Callback<QODResponse>() {
           @Override
           public void onResponse(Call<QODResponse> call, Response<QODResponse> response) {
               if(response.isSuccessful()){
                   if(quotesApiListener !=null && response.body() != null){
                       quotesApiListener.quotesCallback(response.body());
                       Log.d("TAG", response.body() + "");
                   } else {
                       Log.d("TAG",  " response body is null");
                   }
               }
           }

           @Override
           public void onFailure(Call<QODResponse> call, Throwable t) {
               Log.e("TAG", "Falied: " + t.getMessage());
           }
       });
    }

    public interface QuotesApiListener {
        void quotesCallback(QODResponse quote);
    }

}
