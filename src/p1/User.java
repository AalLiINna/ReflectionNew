package p1;

import java.lang.reflect.Constructor;

public class User {
    private String name;
    private String surname;
    private int age;


    User(){}

    User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private String getSurname(){
        return surname;
    }

}