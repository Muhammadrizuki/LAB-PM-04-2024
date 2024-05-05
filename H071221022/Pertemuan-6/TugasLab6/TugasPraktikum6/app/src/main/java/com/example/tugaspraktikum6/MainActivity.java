package com.example.tugaspraktikum6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ApiService apiServicer ;
    private RecyclerView recyclerView;
    private  ProgressBar progressBar;
    private UserAdapter userAdapter;

    private Button buttonload ;
    private int per_page = 3;
    private Call<UserResponse> call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiServicer = RetrofitClient.getClient().create(ApiService.class);
        recyclerView = findViewById(R.id.rcview);
        buttonload = findViewById(R.id.buttonload);
        progressBar = findViewById(R.id.progressBar);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        call = apiServicer.getUsers(per_page);
        buttonload.setOnClickListener((View v)->{
            Call<UserResponse> call2 = apiServicer.getUsers(per_page+3);
            tampilan(executor, call2, progressBar);

        });
        tampilan(executor, call, progressBar);




    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void tampilan(ExecutorService executor, Call<UserResponse> call,  ProgressBar progressBar){
        progressBar.setVisibility(View.VISIBLE);
        executor.execute(()->{call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(@NonNull Call<UserResponse> call, Response<UserResponse> response) {

                if(response.isSuccessful()){
                    Log.d("TAG", "onResponse: sukses");
                    List<User> users = response.body().getData();
                    userAdapter = new UserAdapter(users);
                    recyclerView.setAdapter(userAdapter);
                    progressBar.setVisibility(View.GONE);


                }else{

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {

            }

        });

        });
    }
}