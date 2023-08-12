package com.example.uas_10120056;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

// Nim  : 10120056
// Nama : Chika Rizki Nuraulia
// Kelas: IF2

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if (currentUser==null){
                    startActivity(new Intent(SplashActivity.this,IntroActivity.class));
                }else {
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                }
                finish();
            }
        },1000);
    }
}