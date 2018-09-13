package com.silvertb.logic;
import com.silvertb.design.CodeService;
import com.silvertb.domain.request.RequestUserSave;
import retrofit2.Retrofit;


public class CodeLogic {

    public void save(RequestUserSave req) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .build();

        CodeService service = retrofit.create(CodeService.class);
    }
}
