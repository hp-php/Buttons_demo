package com.example.buttonsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView tvWelcome;
    EditText edt;
    Button btn,register;
    Switch sw;
    ToggleButton tg1;
    RadioButton r1,r2;
    CheckBox cbCricket;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome=  findViewById(R.id.tvWelcome);
        edt=  findViewById(R.id.edt_id);
        btn=  findViewById(R.id.btn_id);
        register=  findViewById(R.id.reg_id);
        sw= (Switch) findViewById(R.id.sw_btn);
        tg1= (ToggleButton) findViewById(R.id.toggle);
        r1= (RadioButton) findViewById(R.id.m_id);
        r2= (RadioButton) findViewById(R.id.F_id);
        cbCricket= findViewById(R.id.cbCricket);
        toolbar= findViewById(R.id.toolbar);

        toolbar.setTitle("abc");

        cbCricket.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                Toast.makeText(MainActivity.this, "Cricket", Toast.LENGTH_SHORT);
            }
        });

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw.isChecked()){
                    Toast.makeText(MainActivity.this, "On", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()){
                    Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT);
                }
                if(r2.isChecked()){
                    Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT);
                }

                if(cbCricket.isChecked()){
                    Toast.makeText(MainActivity.this, "Cricket", Toast.LENGTH_SHORT);
                }
            }
        });

    }


}
