package com.seraffim.myapplication2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    EditText editTtxname;
    EditText editTxt2;
    EditText editTxt3;
    EditText editTxt4;

    View button;
    View button2;
    View button3;




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

        editTtxname = findViewById(R.id.editTtxname);
        editTxt2 = findViewById(R.id.editTxt2);
        editTxt3 = findViewById(R.id.editTxt3);
        editTxt4 = findViewById(R.id.editTxt4);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);



        editTtxname.setText(person.getFirstName());
        editTxt2.setText(person.getLastName());
        editTxt3.setText(person.getPhoneNumber());
        editTxt4.setText(person.getDesiredJob());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           editTtxname.setText("");
           editTxt2.setText("");
           editTxt3.setText("");
           editTxt4.setText("");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "dados salvos e enviados, obrigado", Toast.LENGTH_SHORT).show();
                finish();

            }
        });
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "inscrição finalizada", Toast.LENGTH_SHORT).show();
                 finish();
             }
         });


                // viu como é facil, basta criar uma private string la na model e gerar get and set, poster-
                //ormente pode vir para mainactiviry java e cirar o get ou set, no caso acima, claro, get.v


                //todas as classtest podem ser excluidas, foram usadas apenas para um teste

                ;
    }
    ;

    private String dadosOutraPessoa() {
        return null;
    } }