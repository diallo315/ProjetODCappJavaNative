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
    boolean buttoncliked;


    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.pageprincipale);
        button = findViewById(R.id.btncontenuprincipal);
        txtcontent = findViewById(R.id.textframeContent);
        txterror = findViewById(R.id.textframeError);

        if(saveInstanceState !=null){
            txtcontent.setText(saveInstanceState.getString("cleTexte"));
            txtcontent.setVisibility(saveInstanceState.getInt("txtcontentvisibility", View.VISIBLE));

            txterror.setText(saveInstanceState.getString("cleTexte1"));
            txterror.setVisibility(saveInstanceState.getInt("txtcontentvisibility1", View.VISIBLE));

            buttoncliked = saveInstanceState.getBoolean("buttonholed", false);
            if(buttoncliked){
                button.setBackgroundColor(Color.RED);
            }
        }

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtcontent.setVisibility(View.GONE);
                txterror.setVisibility(View.VISIBLE);
                button.setBackgroundColor(Color.RED);
                buttoncliked = true;
            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outSate) {
        super.onSaveInstanceState(outSate);
        outSate.putString("cleTexte", txtcontent.getText().toString());
        outSate.putString("cleTexte1", txterror.getText().toString());

        outSate.putBoolean("buttonholed", buttoncliked);

        outSate.putInt("txtcontentvisibility", txtcontent.getVisibility());
        outSate.putInt("txtcontentvisibility1", txterror.getVisibility());
    }
}
