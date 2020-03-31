package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSandwiches;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("FAST FOOD");

        btnSandwiches = (Button) findViewById(R.id.btnSandwiches);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
    }

    public void selectSandwich(View view){
        Intent intentSelectSandwich = new Intent(this, SelectSandwich.class);
        startActivity(intentSelectSandwich);
    }

    public void aboutUs(View view){
        Intent intentAboutUs = new Intent(this, AboutUsActivity.class);
        startActivity(intentAboutUs);
    }
}
