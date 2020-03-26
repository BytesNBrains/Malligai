package com.threesixtystudios.malligai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class details extends AppCompatActivity {

    //EditText name = (EditText) findViewById(R.id.input_name);
    Button mbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mbutton = (Button) findViewById(R.id.sbmit);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(details.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
