package com.example.chatbot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;
public interface RetrofitAPI {
    @GET
    default Call<MsdModal> getMessage(@Url String url) {
        return null;
    }

}
