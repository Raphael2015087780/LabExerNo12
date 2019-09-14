package com.baetiong.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class QPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qp);
    }

    public void goBack (View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void goToQP (View v){
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ph21stcenturypark.blogspot.com/2012/10/ust-quadri-park.html"));
        startActivity(browser);
    }
}
