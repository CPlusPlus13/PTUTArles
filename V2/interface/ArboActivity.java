package com.ptut.projetptut_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.ptut.projetptut_v1.Semantique.Tclassique;

import java.util.ArrayList;

public class ArboActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbo);

        //----------
        ArrayList<Tclassique> myList= new ArrayList<Tclassique>();
        Tclassique newUser = new Tclassique(1,2,3,"Ouiii");
        Tclassique newUser2 = new Tclassique(2,3,4,"Allez");
        myList.add(newUser);
        myList.add(newUser2);

        GridView gridView= findViewById(R.id.gridViewTuile);

        TuileAdapter adapter= new TuileAdapter(this,myList);
        gridView.setAdapter(adapter);

    }

    public void btnAccueil(View view) {
        Intent intent= new Intent(ArboActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void btnRetour(View view) {
        Toast.makeText(getApplicationContext(),"Fonctionnalité à venir.",Toast.LENGTH_LONG).show();
    }

    public void accept(View view) {
        Toast.makeText(getApplicationContext(),"Fonctionnalité à venir.",Toast.LENGTH_LONG).show();
    }

}
