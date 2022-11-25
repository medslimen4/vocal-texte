package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;


public class MainActivity extends AppCompatActivity {

  TextView user;
  ImageButton logOutB,profileB;
  Button todoB,editProfileB;
  CardView contributeCard,practiceCard,learnCard,interestsCard,helpCard,settingsCard ;
  TextInputEditText TextInputEditTextUsername;
  String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.usernameview);
        // register all the ImageButtons with their appropriate IDs
         logOutB= findViewById(R.id.logOutB);
         profileB = findViewById(R.id.profileB);

        // register all the Buttons with their appropriate IDs
        todoB = findViewById(R.id.todoB);
        editProfileB= findViewById(R.id.editProfileB);

        // register all the card views with their appropriate IDs
         contributeCard= findViewById(R.id.contributeCard);
         practiceCard= findViewById(R.id.practiceCard);
         learnCard= findViewById(R.id.learnCard);
         interestsCard = findViewById(R.id.interestsCard);
         helpCard = findViewById(R.id.helpCard);
         settingsCard= findViewById(R.id.logoutCard);



        PutData putData = new PutData("http://ef54-197-22-231-52.ngrok.io/LoginRegister/getuser.php", "POST", new String[]{"field"}, new String[]{"data"});
        if (putData.startPut()) {
            if (putData.onComplete()) {
                result = putData.getResult();
                user.setText(result);

            }
            }



        // handle each of the image buttons with the OnClickListener

        logOutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"see you soon",Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
        profileB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
            }
        });

        todoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
            }
        });
        editProfileB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
            }
        });

        // handle each of the buttons with the OnClickListener
        contributeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mic.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(),"change your vocal to text",Toast.LENGTH_SHORT).show();
            }
        });
        practiceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Practice.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(),"Practice now",Toast.LENGTH_SHORT).show();
            }
        });
        learnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Learn.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(),"learn",Toast.LENGTH_SHORT).show();
            }
        });
        interestsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
            }
        });
        helpCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Contact.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(),"we will reply to you as soon as possible",Toast.LENGTH_SHORT).show();
            }
        });
        settingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(), "GOODBYE  "+result,Toast.LENGTH_SHORT).show();
            }
        });

}
    }
