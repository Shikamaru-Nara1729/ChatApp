package com.example.testchat.Fragments;

import com.example.testchat.Notifications.MyResponse;
import com.example.testchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService{
    @Headers (
             {
                "Content-Type:application/json",
                "Authorization:key=AAAAKEot6jA:APA91bGo8kDQV01R9CR3UtYrdZffuoRZbFzlPiLipP0jNTAwq8BWwvjPU43jbONVBHNcl-CfnfEH71MCcSLmMHWDY4mPw1LFEC4L_2hqF2u8tbzlxkzg0seaRj-jVfDdLrOcwNdbpn_o"
             }

    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
