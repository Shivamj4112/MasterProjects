package com.activity.masterprojects2.Data_with_budle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.activity.masterprojects2.databinding.ActivityDataPassingwithBundleBinding;
import com.activity.masterprojects2.databinding.ActivityMainBinding;

public class DataPassingwithBundleActivity extends AppCompatActivity {

    private ActivityDataPassingwithBundleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDataPassingwithBundleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        binding.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = binding.edtText.getText().toString();

                Intent intent = new Intent(DataPassingwithBundleActivity.this, secondActivitydata.class);

                Bundle bundle = new Bundle();
                bundle.putString("text", text);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });


    }
}