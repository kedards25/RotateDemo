package com.learning.rotatedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnIncr,btnDecr;
    TextView txtCount;
    private  int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIncr=findViewById(R.id.btn_incr);
        btnDecr=findViewById(R.id.btn_decr);
        txtCount=findViewById(R.id.txt_count);
        txtCount.setText(String.valueOf(counter));
        btnIncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrCount();
            }
        });

        btnDecr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrCount();
            }
        });

        if (savedInstanceState!= null)
        {
            counter=savedInstanceState.getInt("cnt");
            txtCount.setText(String.valueOf(counter));

        }
    }

    private void decrCount() {
        counter--;
        txtCount.setText(String.valueOf(counter));
    }

    private void incrCount() {
        counter++;
        txtCount.setText(String.valueOf(counter));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("cnt",counter);

    }
}
