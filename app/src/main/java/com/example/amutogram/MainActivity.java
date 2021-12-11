package com.example.amutogram;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editTextNumber;
    private TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView2 = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Toast.makeText( MainActivity.this,  "Hi click listener worked!", Toast.LENGTH_SHORT).show();

                String s = editTextNumber.getText().toString();
                double amu = Double.parseDouble(s);
                double gram = 1.66054 * amu;
                textView2.setText("The corresponding value in gram is "+ gram);

            }
        });
    }
}