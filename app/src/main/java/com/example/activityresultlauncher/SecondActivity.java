package com.example.activityresultlauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int number2 = getIntent().getIntExtra("number2", 0);

        Button btnSendBackData = findViewById(R.id.btnSendDataBack);

        btnSendBackData.setOnClickListener(view -> {

            Intent intent = new Intent();
            intent.putExtra("2x2", number2 * 2);
            setResult(RESULT_OK, intent);
            finish();

        });

    }
}