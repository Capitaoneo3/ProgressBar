package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarHorizontal;
    private ProgressBar prograssBarCircular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBarHorizontal= findViewById(R.id.progressBarHorizontal);
        prograssBarCircular=findViewById(R.id.progressBarCircular);

    }
    public void     carregarProgressBar(View view){

    }
}