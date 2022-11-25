package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Practice extends AppCompatActivity {
    ImageView cop;
    EditText txt;
    ImageButton backp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


        cop = findViewById(R.id.cop);
        txt = findViewById(R.id.txt);
        backp = findViewById(R.id.backp);


        backp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




        cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code to copy to clipboard
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                clipboardManager.setPrimaryClip(ClipData.newPlainText("label",txt.getText().toString().trim()));
                Toast.makeText(Practice.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}