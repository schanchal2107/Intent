package com.example.mob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class about extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        imgButton = (ImageButton) findViewById(R.id.imageButton);
    }

    public void clickme(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Payment Successful", Toast.LENGTH_SHORT);
        toast.show();
    }
}