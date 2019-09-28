package com.navarro.lab3navarrofredriek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText etUser1, etUser2, etUser3, etUser4, etUser5, etUser6, etUser7,etUser8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser1 = findViewById(R.id.editText1);
        etUser2 = findViewById(R.id.editText2);
        etUser3 = findViewById(R.id.editText3);
        etUser4 = findViewById(R.id.editText4);
        etUser5 = findViewById(R.id.editText5);
        etUser6 = findViewById(R.id.editText6);
        etUser7 = findViewById(R.id.editText7);
        etUser8 = findViewById(R.id.editText8);
    }
    public void saveData(View view) {
        String data1 = etUser1.getText().toString();
        String data2 = etUser2.getText().toString();
        String data3 = etUser3.getText().toString();
        String data4 = etUser4.getText().toString();
        String data5 = etUser5.getText().toString();
        String data6 = etUser6.getText().toString();
        String data7 = etUser7.getText().toString();
        String data8 = etUser8.getText().toString();

        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(data1.getBytes());
            writer.write(data2.getBytes());
            writer.write(data3.getBytes());
            writer.write(data4.getBytes());
            writer.write(data5.getBytes());
            writer.write(data6.getBytes());
            writer.write(data7.getBytes());
            writer.write(data8.getBytes());

        } catch (FileNotFoundException e) {
            Log.d("error", "file not found...");
        } catch (IOException e){
            Log.d("error", "IO error...");
        } finally {
            try{
                writer.close();
            } catch (IOException e){
                Log.d("error", "file not found...");
            }
        }
        Toast.makeText(this, "data is saved...", Toast.LENGTH_LONG).show();

    }
    public void buttonNext(View view){
        Intent i = new Intent(this, SecondActivity.class);

        startActivity(i);
    }

}