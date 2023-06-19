package com.seraffim.myapplication2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.seraffim.myapplication2.R;
import com.seraffim.myapplication2.model.Classtest;
import com.seraffim.myapplication2.model.Person;
import com.seraffim.myapplication2.model.curso;

public class MainActivity extends AppCompatActivity {

    Person person;
    // acima esta usando person, que é a calsse pessoa e objeto pessoa.
    Classtest classtest;
    curso curso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Person = New person, ou seja, um novo objeto foi criado aqui.
        person = new Person();
        classtest = new Classtest();
        curso = new curso();

        //todas as classtest podem ser excluidas, foram usadas apenas para um teste

    }
}