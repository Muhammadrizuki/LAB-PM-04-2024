package com.example.tugaspraktikum6;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Call;

public interface ApiService {
    @GET("api/users")
    Call<UserResponse> getUsers(@Query("per_page") int per_page);
    Call<UserResponse> getUsersmore(@Query("per_page") int per_page);

}
