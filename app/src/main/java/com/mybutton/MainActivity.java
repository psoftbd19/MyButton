package com.mybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener */{

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private TextView tvOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        tvOutput = (TextView) findViewById(R.id.tvOutput);

       /* btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
*/

       /* btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText("Button One");
                Toast.makeText(MainActivity.this, "bnt one", Toast.LENGTH_LONG).show();
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText("Button Two");
                Toast.makeText(MainActivity.this, "bnt two", Toast.LENGTH_SHORT).show();
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText("Button Three");
                Toast.makeText(MainActivity.this, "bnt three", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
/*
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnOne:
                tvOutput.setText("Button One");
                Toast.makeText(MainActivity.this, "bnt one", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnTwo:
                tvOutput.setText("Button Two");
                Toast.makeText(MainActivity.this, "bnt two", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnThree:
                tvOutput.setText("Button Three");
                Toast.makeText(MainActivity.this, "bnt three", Toast.LENGTH_SHORT).show();

        }
    }*/

    public void goOne(View view) {
        tvOutput.setText("Button One");
        Toast.makeText(MainActivity.this, "bnt one", Toast.LENGTH_LONG).show();
    }

    public void goTwo(View view) {
        tvOutput.setText("Button Two");
        Toast.makeText(MainActivity.this, "bnt two", Toast.LENGTH_SHORT).show();
    }

    public void goThree(View view) {
        tvOutput.setText("Button Three");
        Toast.makeText(MainActivity.this, "bnt three", Toast.LENGTH_SHORT).show();
    }
}
