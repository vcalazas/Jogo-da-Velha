package com.example.vcalazas.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void JvsJ(View v){
        Intent intent = new Intent(this, Jogador_vs_Jogador.class);
        startActivity(intent);
    }

    public void JvsC(View v){
        Intent intent = new Intent(this, Jogador_vs_Celular.class);
        startActivity(intent);
    }

}
