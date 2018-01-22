package com.example.swarathesh60.cancermoonshot.services;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by swarathesh60 on 22/1/18.
 */

public interface UserCli {
    //https://cmsapp-189905.appspot.com/UploadFileToCloud

    @Multipart
    @POST("/UploadFileToCloud")
    Call<ResponseBody> UploadImages(
            @Part List<MultipartBody.Part> files
    );


}
