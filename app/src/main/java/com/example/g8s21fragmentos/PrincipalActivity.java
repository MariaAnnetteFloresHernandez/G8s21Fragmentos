package com.example.g8s21fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PrincipalActivity extends AppCompatActivity {
    Fragment fgi, fg1,fg2;
    FragmentTransaction cambiofrgmento;
    Button btnfg1, btnfg2;
    FloatingActionButton btnHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        fgi = new InicialFragment();
        fg1 = new PrimeroFragment();
        fg2 = new SegundoFragment();

        btnfg1 = findViewById(R.id.Btnfrag1);
        btnfg2 = findViewById(R.id.Btnfrag2);
        btnHome = findViewById(R.id.btnHome);

        getSupportFragmentManager().beginTransaction().add(R.id.Fragmento,fgi).commit();
    }


    public void Botones(View v){
        cambiofrgmento = getSupportFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.Btnfrag1:
                 cambiofrgmento.replace(R.id.Fragmento,fg1);
                 cambiofrgmento.addToBackStack(null);
                break;
            case R.id.Btnfrag2:
                cambiofrgmento.replace(R.id.Fragmento,fg2);
                cambiofrgmento.addToBackStack(null);
                break;
            case R.id.btnHome:
                cambiofrgmento.replace(R.id.Fragmento,fgi);
                break;
        }
        cambiofrgmento.commit();
    }
}