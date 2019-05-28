package com.example.biggernumber;
import java.util.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private Button Button1;
    private Button Button2;
    private TextView pointt;
    private int num2, num3;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById((R.id.textView2));
        Button1 = (Button) findViewById(R.id.button1);
        Button2 = (Button) findViewById(R.id.button2);
        pointt = (TextView) findViewById(R.id.point);

        Random rand = new Random();
        num2 = rand.nextInt(1000);
        num3 = rand.nextInt(1000);

        Button1.setText(String.valueOf(num2));
        Button2.setText(String.valueOf(num3));
        pointt.setText("point:" + String.valueOf(count));

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(Button1.getText().toString()) >= Integer.parseInt(Button2.getText().toString())) {
                    count++;
                    pointt.setText("point:" + String.valueOf(count));
                } else {
                    count--;
                    pointt.setText("point:" + String.valueOf(count));
                }

                Random rand = new Random();
                int num2 = rand.nextInt(1000);
                int num3 = rand.nextInt(1000);

                Button1.setText(String.valueOf(num2));
                Button2.setText(String.valueOf(num3));
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(Button1.getText().toString()) <= Integer.parseInt(Button2.getText().toString())) {
                    count++;
                    pointt.setText("point:" + String.valueOf(count));
                } else {
                    count--;
                    pointt.setText("point:" + String.valueOf(count));
                }
                Random rand = new Random();
                num2 = rand.nextInt(1000);
                num3 = rand.nextInt(1000);

                Button1.setText(String.valueOf(num2));
                Button2.setText(String.valueOf(num3));
            }
        });

    }

}