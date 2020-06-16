package com.example.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void  converter(View view){

        EditText inrEditTextNumber = (EditText) findViewById(R.id.inrEditTextNumber);
        Double inrAmountDouble = Double.parseDouble(inrEditTextNumber.getText().toString());
        Double dollerAmount = inrAmountDouble * 76.06;
        Toast.makeText(MainActivity.this,"$ "+dollerAmount,Toast.LENGTH_SHORT).show();
        Log.i("Amount",inrEditTextNumber.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}