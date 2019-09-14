package com.baetiong.labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LoversLaneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovers_lane);
    }


    public void goLovers (View v) {
        Intent i = new Intent(this, LoversLaneActivity.class);
        startActivity(i);
    }

    public void goBack (View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void goToLovers (View v) {
        Intent browser = new Intent (Intent.ACTION_VIEW, Uri.parse("https://tomasinoweb.org/stories/features/haven-thomasian-lovers/"));
        startActivity(browser
        );
    }

}
