package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(View view){
        TextView textStatic = findViewById(R.id.text1);
        EditText textEdit = findViewById(R.id.editText);
        textStatic.setText(textEdit.getText());
    }
}
