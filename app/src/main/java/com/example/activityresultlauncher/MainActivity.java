package com.example.activityresultlauncher;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSendData = findViewById(R.id.btnSendData);
        btnSendData.setOnClickListener(view -> {

            openSecondActivityForResult();

        });

    }

    private void openSecondActivityForResult() {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("number2", 2);

    }


    ActivityResultLauncher<Intent> secondActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {

                if (result.getResultCode() == Activity.RESULT_OK) {

                    Intent data = result.getData();

                    int operationResult = data.getIntExtra("2x2", 0);

                }

            }
    );

}