package com.seraffim.myapplication2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.seraffim.myapplication2.R;
import com.seraffim.myapplication2.model.Person;

public class MainActivity extends AppCompatActivity {

    Person person;
    // acima esta usando person, que é a calsse pessoa e objeto pessoa.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Person = New person, ou seja, um novo objeto foi criado aqui.
        person = new Person();

    }
}