package com.silvertb.design;

import com.silvertb.api.Api;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CodeService {
    @GET("api/v1/code")
    Call<Api<String>> testSend();
}
