package com.example.interactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText nameEditText = (EditText)findViewById(R.id.nameEditText);
        EditText password = (EditText)findViewById(R.id.editTextPassword);
        Log.i("Info", "It Worked!!");

        Log.i("Values", nameEditText.getText().toString() + " Loged in");

        Toast.makeText(this, "Hi there!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}