package model;

public abstract class Person {
    protected String nama;

    public Person(String nama){
        this.nama = nama;
    }

    public abstract void tampilData();
}
