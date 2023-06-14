package com.seraffim.myapplication2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.seraffim.myapplication2.R;
import com.seraffim.myapplication2.model.ClassTest2;
import com.seraffim.myapplication2.model.Classtest;
import com.seraffim.myapplication2.model.Classtest3;
import com.seraffim.myapplication2.model.Classtest4;
import com.seraffim.myapplication2.model.Classtest5;
import com.seraffim.myapplication2.model.Classtest6;
import com.seraffim.myapplication2.model.Classtest7;
import com.seraffim.myapplication2.model.Person;

public class MainActivity extends AppCompatActivity {

    Person person;
    // acima esta usando person, que é a calsse pessoa e objeto pessoa.
    Classtest classtest;

    ClassTest2 classTest2;

    Classtest3 classtest3;

    Classtest4 classtest4;

    Classtest5 classtest5;

    Classtest6 classtest6;

    Classtest7 classtest7
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Person = New person, ou seja, um novo objeto foi criado aqui.
        person = new Person();
        classtest = new Classtest();
        classTest2 = new ClassTest2();
        classtest3 = new Classtest3();
        classtest4 = new Classtest4();
        classtest5 = new Classtest5();
        classtest6 = new Classtest6();
        classtest7 = new Classtest7();
        //todas as classtest podem ser excluidas, foram usadas apenas para um teste

    }
}