package com.example.zeexhan.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private static final int SELECT_IMAGE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        Intent intent = null, chooser = null;
        if (view.getId() == R.id.maps) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://maps.google.com/maps"));
            chooser = Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }
        if (view.getId() == R.id.playstore) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://play.google.com/store"));
            chooser = Intent.createChooser(intent, "Launch Play Store");
            startActivity(chooser);
        }
        if (view.getId() == R.id.Gallery) {
//            intent = new Intent();
//            intent.setType("image/*");
//            intent.setAction(Intent.ACTION_GET_CONTENT);
//            startActivityForResult(Intent.createChooser(intent, "Select Picture"),SELECT_IMAGE);

            intent = new Intent();
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setType("image/*");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}
