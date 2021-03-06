package com.gravityview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import co.gofynd.gravityview.GravityView;

public class MainActivity extends AppCompatActivity {

    private ImageView bg;
    private GravityView gravityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg = (ImageView) findViewById(R.id.bg);
        gravityView = GravityView.getInstance(this)
                .setImage(bg, R.drawable.landingbg)
                .center();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gravityView.registerListener();
    }

    @Override
    protected void onStop() {
        super.onStop();
        gravityView.unRegisterListener();
    }
}
