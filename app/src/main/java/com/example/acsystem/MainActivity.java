package com.example.acsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_up);
    }
    Button btn_startup_google = (Button) findViewById(R.id.btn_startup_google);
   myButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    });

}