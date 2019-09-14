package com.baetiong.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
    }

    public void goBack (View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void goLovers (View v) {
        Intent i = new Intent(this, LoversLaneActivity.class);
        startActivity(i);
    }

    public void goHospital (View v) {
        Intent i = new Intent(this, HospitalActivity.class);
        startActivity(i);
    }

    public void goMain (View v) {
        Intent i = new Intent(this, MainbActivity.class);
        startActivity(i);
    }

    public void goQP (View v) {
        Intent i = new Intent(this, QPActivity.class);
        startActivity(i);
    }
}
