package com.example.admin.ingridgracia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ChangeName(View view) {
        TextView tvName =findViewById(R.id.tvName);
        tvName.setText("Myrtil Stephano Berlin Victor");

    }
}
