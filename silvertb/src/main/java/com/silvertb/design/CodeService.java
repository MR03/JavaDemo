package com.silvertb.design;

import retrofit2.Call;
import retrofit2.http.*;

public interface CodeService {
    @Headers({
        "AppKey: 12a43fa28a24d95041ff448850d68046"
    })
    @POST("sms/sendcode")
    Call<VerifyCode> sendCode(@Body SendCode sendCode, @Header("Nonce") String nonce, @Header("CurTime") String curTime, @Header("CheckSum") String checkSum);
}
