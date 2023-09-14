package com.seraffim.myapplication2.model;

public class Person {
    //para constuir um objeto é necessário have um construtor = pessoa
    // atributos = objetos - model - template
    // metodos de acesso sao getss and sets

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String serafim) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesiredJob(String android_develloper) {
        return desiredJob;
    }

    public void setDesiredJob(String desiredJob) {
        this.desiredJob = desiredJob;
    }

    public String getPhoneNumber(String s) {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String firstName;
    private String lastName;
    private String desiredJob;
    private String phoneNumber;


    public Person (){}

    public void getFirstName(String joao) {
    }

    public String getDesiredJob() {
        return null;
    }

    public String getLastName() {
        return null;
    }

    public String getPhoneNumber() {
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", desiredJob='" + desiredJob + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
