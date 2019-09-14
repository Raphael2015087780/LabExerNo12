package com.baetiong.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainb);
    }

    public void goBack (View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void goToMain (View v){
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://varsitarian.net/20180102/circle/ust-main-building-at-90"));
        startActivity(browser);
    }
}
