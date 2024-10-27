package io.test;

import java.io.Serializable;

public class User2 implements Serializable {
    String name;
    int age;
    String phone;

    public User2(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "name: "+name+" | age: "+age+" | phone: "+phone;
    }
}

