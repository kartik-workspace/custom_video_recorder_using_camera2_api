package com.example.videorecorderusingcamera2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.videorecorderusingcamera2.kotlin.MainActivityKotlin;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        Button javaButton = findViewById(R.id.javaButton);
        Button kotlinButton = findViewById(R.id.kotlinButton);

        javaButton.setOnClickListener(v -> {
            Intent intent = new Intent(EntryActivity.this, MainActivity.class);
            startActivity(intent);
        });

        kotlinButton.setOnClickListener(v -> {
            Intent intent = new Intent(EntryActivity.this, MainActivityKotlin.class);
            startActivity(intent);
        });
    }
}
