package com.silvertb.logic;
import com.silvertb.api.Api;
import com.silvertb.design.CodeService;
import com.silvertb.design.SendCode;
import com.silvertb.design.VerifyCode;
import com.silvertb.utils.Time;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.fastjson.FastJsonConverterFactory;


public class CodeLogic {

    public static void sendCode() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.netease.im/")
                .addConverterFactory(FastJsonConverterFactory.create())
                .build();

        CodeService service = retrofit.create(CodeService.class);
        // 请求头
        String APP_SECRET = "5c560ecd7465";
        String nonce = "4tgggergigwow323t";
        String curTime = Time.timestampSecond();

        SendCode sendCode = new SendCode("15008260209");

        Call<VerifyCode> repos = service.sendCode(sendCode, nonce, curTime, CheckSumBuilder.getCheckSum(APP_SECRET, nonce, curTime));
        repos.enqueue(new Callback<VerifyCode>() {
            @Override
            public void onResponse(Call<VerifyCode> call, Response<VerifyCode> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<VerifyCode> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }

    public static String createNonce() {
        return "123123";
    }
}
