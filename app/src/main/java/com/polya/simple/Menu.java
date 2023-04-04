package com.polya.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;


public class Menu extends AppCompatActivity {
    private ImageButton b;
    private ImageButton bX;
    private ImageButton bO;
    private Switch sw;
    public static Boolean vibor=true;
    public static Boolean swTf=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        perehod();
        swich();
    }
    private void swich(){
        sw=(Switch) findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    swTf=true;
                }else {
                    swTf=false;
                }
            }
        });
    }
    public void perehod(){
        b=(ImageButton) findViewById(R.id.play);
        bX=(ImageButton) findViewById(R.id.krestic);
        bO=(ImageButton) findViewById(R.id.nolic);
       // sw=(Switch)findViewById(R.id.switch1);
      //  sw.onCheckIsTextEditor()
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in=new Intent("com.polya.simple.MainActivity");
                        startActivity(in);
                    }
                }
        );

        bX.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bX.setBackgroundColor(getResources().getColor(R.color.on));
                        bO.setBackgroundColor(getResources().getColor(R.color.off));
                        vibor=false;
                    }
                }
        );

        bO.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bO.setBackgroundColor(getResources().getColor(R.color.on));
                        bX.setBackgroundColor(getResources().getColor(R.color.off));
                        vibor=true;
                    }
                }
        );
    }
}