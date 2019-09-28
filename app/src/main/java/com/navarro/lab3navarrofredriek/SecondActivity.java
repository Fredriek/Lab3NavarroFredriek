package com.navarro.lab3navarrofredriek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondActivity extends AppCompatActivity {
    CheckBox etUser1, etUser2, etUser3, etUser4, etUser5, etUser6, etUser7,etUser8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setContentView(R.layout.activity_main);
        etUser1 = findViewById(R.id.checkBox1);
        etUser2 = findViewById(R.id.checkBox2);
        etUser3 = findViewById(R.id.checkBox3);
        etUser4 = findViewById(R.id.checkBox4);
        etUser5 = findViewById(R.id.checkBox5);
        etUser6 = findViewById(R.id.checkBox6);
        etUser7 = findViewById(R.id.checkBox7);
        etUser8 = findViewById(R.id.checkBox8);
    }
    public void showData(View v){
        FileInputStream reader = null;
        String data1="";
        String data2="";
        String data3="";
        String data4="";
        String data5="";
        String data6="";
        String data7="";
        String data8="";
        try {
            reader = openFileInput("data1.txt");
            int token;
            while((token = reader.read()) != -1){
                data1 = data1 + (char)token;
                data2 = data2 + (char)token;
                data3 = data3 + (char)token;
                data4 = data4 + (char)token;
                data5 = data5 + (char)token;
                data6 = data6 + (char)token;
                data7 = data7 + (char)token;
                data8 = data8 + (char)token;
            }
        } catch (FileNotFoundException e) {
            Log.d("error", "file not found...");
        } catch (IOException e){
            Log.d("error", "IO error...");
        }
        Toast.makeText(this, data1, Toast.LENGTH_LONG).show();

    }


}
