package com.seraffim.myapplication2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.seraffim.myapplication2.R;
import com.seraffim.myapplication2.model.Classtest;
import com.seraffim.myapplication2.model.Person;
import com.seraffim.myapplication2.model.Curso;

public class MainActivity extends AppCompatActivity {

    Person person;

    // acima esta usando person, que é a calsse pessoa e objeto pessoa.
    Classtest classtest;
    Curso curso;

    String dadosPessoa; // pascalCaSE - camelCase

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Classtest getClasstest() {
        return classtest;
    }

    public void setClasstest(Classtest classtest) {
        this.classtest = classtest;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getDadosPessoa() {
        return dadosPessoa;
    }

    public void setDadosPessoa(String dadosPessoa) {
        this.dadosPessoa = dadosPessoa;
    }

    public String getDadosOutraPessoa() {
        return dadosOutraPessoa;
    }

    public void setDadosOutraPessoa(String dadosOutraPessoa) {
        this.dadosOutraPessoa = dadosOutraPessoa;
    }

    String dadosOutraPessoa;

    @Override
    public String toString() {
        return "MainActivity{" +
                "person=" + person +
                ", classtest=" + classtest +
                ", curso=" + curso +
                ", dadosPessoa='" + dadosPessoa + '\'' +
                ", dadosOutraPessoa='" + dadosOutraPessoa + '\'' +
                '}';
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Person = New person, ou seja, um novo objeto foi criado aqui.



        person = new Person();

        person.getFirstName("joao");
        person.getLastName("serafim");
        person.getDesiredJob("android develloper");
        person.getPhoneNumber("31231223");

        person = new Person();

        person.setDesiredJob("software engenier");
        person.setFirstName("joao vitor");
        person.setLastName("serafim");
        person.setPhoneNumber("7600949234");



        Log.i("poo android", person.toString());
        /// agora vamos criar os get da outras duas classes de exempl

        classtest = new Classtest();

        classtest.getAlunosComMaiorpresenca("sr.brown");
        classtest.getAlunosCommenorPresenca("Zary");
        classtest.getMelhoresdoano("Adelaide");
        classtest.getPioresAlunosDoAno("marco");



        // agora vamos fazer como exemplo dos melhores em determinadas linguagems de programacao //

        curso = new Curso();

        curso.getMelhoresDOano("Maria");
        curso.getMelhorEmjava("Dean");
        curso.getMelhorEmkotlin("jhonson");
        curso.getMelhorEmlinguemC("john");
        curso.getMelhorEmRuby("manoel");
        curso.getMelhorEmFlutter("carlos");
        curso.getMelhorEmPhyton("luiz");

        // viu como é facil, basta criar uma private string la na model e gerar get and set, poster-
        //ormente pode vir para mainactiviry java e cirar o get ou set, no caso acima, claro, get.v


        //todas as classtest podem ser excluidas, foram usadas apenas para um teste

       }

    private String dadosOutraPessoa() {
        return null;
    } }