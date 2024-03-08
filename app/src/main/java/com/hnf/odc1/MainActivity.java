package com.hnf.odc1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth);


        Button btn = findViewById(R.id.btnauth);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = email.getText().toString();
                String pass = password.getText().toString();
                Log.e("MainActivity", "email : " + username + " password : " + pass);
                System.out.println("EMAIL : " + username + " PASSWORD : " + pass);
            Intent intent = new Intent(MainActivity.this, pageprincipale.class);
            startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.e("CycleDeVie", "OnStart est appélé");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e("CycleDeVie", "OnResume est appélé");
    }
    @Override
    protected void onPause() {

        super.onPause();
        Log.e("CycleDeVie", "OnPause est appélé");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.e("CycleDeVie", "OnStop est appélé");
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.e("CycleDeVie", "onDestroy est appélé");
    }
}