package com.example.mitab.convertmilestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilestoKm= (Button) findViewById(R.id.buttonconvmilestokm);
        buttonConvMilestoKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxMiles= (EditText) findViewById(R.id.editTextmiles);
                EditText textboxKm= (EditText) findViewById(R.id.editTextkm);
                double vMiles=Double.valueOf(textboxMiles.getText().toString());
                double vKm=vMiles/0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                textboxKm.setText(formatVal.format(vKm));
            }
        });
        Button buttonConvKmToMiles= (Button) findViewById(R.id.buttonConvKmtoMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxMiles= (EditText) findViewById(R.id.editTextmiles);
                EditText textboxKm= (EditText) findViewById(R.id.editTextkm);
                double vKm=Double.valueOf(textboxKm.getText().toString());
                double vMiles=vKm*0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                textboxMiles.setText(formatVal.format(vMiles));
            }
        });
    }
}
