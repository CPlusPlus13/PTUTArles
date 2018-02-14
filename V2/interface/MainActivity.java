package com.ptut.projetptut_v1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int comptUrg= 0;
    private TextView t= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= findViewById(R.id.text_acc);
        t.setTypeface(Typeface.MONOSPACE);
    }

    public void arboVocal(View view) {
        Intent intent= new Intent(MainActivity.this, ArboActivity.class);
        startActivity(intent);
    }

    public void btnUrgent(View view) {
        ImageButton i= (ImageButton) view;
        switch (comptUrg) {
            case 0:
                i.setScaleX(2.0f);
                i.setScaleY(2.0f);
                ++comptUrg;
            break;
            case 1:
                i.setColorFilter(Color.BLUE);
                ++comptUrg;
            break;
            case 2:
                Toast.makeText(getApplicationContext(),"Fonctionnalité à venir.",Toast.LENGTH_LONG).show();
                i.setColorFilter(Color.BLACK);
                i.setScaleX(1.0f);
                i.setScaleY(1.0f);
                comptUrg= 0;
            break;
            default: comptUrg= 0;
        }
    }
}
