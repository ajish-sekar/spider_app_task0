package com.example.android.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int no=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.increement);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              no+=1;
                TextView number = (TextView) findViewById(R.id.number);
                number.setText(no + "");
            }
        });

        Button button2 = (Button) findViewById(R.id.decreement);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no-=1;
                TextView number = (TextView) findViewById(R.id.number);
                number.setText(no + "");
            }
        });
    }
}
