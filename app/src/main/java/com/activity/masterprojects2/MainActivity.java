package com.activity.masterprojects2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.activity.masterprojects2.Activity_intent.Intent_call_Activty;
import com.activity.masterprojects2.Activity_intent.Intent_dial_Activty;
import com.activity.masterprojects2.Gallery_Acess.Access_Gallery_Activty;
import com.activity.masterprojects2.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);

        checkPermission();
        clickEvent();

    }

    private void checkPermission() {



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                requestPermissions(PublicVariables.permission,0);

            }
        }
    }

    private void clickEvent() {

        mainBinding.imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainBinding.drawer.openDrawer(Gravity.LEFT);

            }
        });

        mainBinding.navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.intent_call:

                        startActivity(new Intent(MainActivity.this, Intent_call_Activty.class));
                        break;

                    case R.id.intent_dial:

                        startActivity(new Intent(MainActivity.this, Intent_dial_Activty.class));
                        break;

                    case R.id.intent_gallery:

                        startActivity(new Intent(MainActivity.this, Access_Gallery_Activty.class));
                        break;

                }


                return false;
            }
        });
    }
}