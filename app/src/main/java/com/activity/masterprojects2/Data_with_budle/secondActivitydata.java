package com.activity.masterprojects2.Data_with_budle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.activity.masterprojects2.databinding.ActivityDataPassingwithBundleBinding;
import com.activity.masterprojects2.databinding.ActivitySecondActivitydataBinding;

public class secondActivitydata extends AppCompatActivity {

    ActivitySecondActivitydataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondActivitydataBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        Bundle bundle = getIntent().getExtras();
        String venName = bundle.getString("text");
        binding.txtText.setText(venName);

    }
}