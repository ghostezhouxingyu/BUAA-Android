package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);
        final EditText delv = findViewById(R.id.delv);
        final ImageButton ibtn1 = findViewById(R.id.ibtn1);
        final TextView tv2 = findViewById(R.id.tv2);
        final TextView tv3 = findViewById(R.id.tv3);
        tv2.setGravity(Gravity.CENTER);
        tv3.setGravity(Gravity.CENTER);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = delv.getText().toString();
                tv1.setText("Thanks for your support");
                tv3.setText(num);
                Log.d("MainActivity","submit telephone");
            }
        });

        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ibtn1.setColorFilter(Color.parseColor("#ffd700"));
                tv2.setText("Thanks for your star");
                Log.d("MainActivity", "star the app");
            }
        });

        Log.d("MainActivity","enter the app");
    }
}
