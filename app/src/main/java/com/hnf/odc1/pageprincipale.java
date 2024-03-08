package com.hnf.odc1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pageprincipale extends AppCompatActivity {

    Button button;
    TextView txtcontent, txterror;
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.pageprincipale);
        button = findViewById(R.id.btncontenuprincipal);
        txtcontent = findViewById(R.id.textframeContent);
        txterror = findViewById(R.id.textframeError);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtcontent.setVisibility(View.GONE);
                txterror.setVisibility(View.VISIBLE);
                button.setBackgroundColor(Color.RED);
            }
        });


    }}
