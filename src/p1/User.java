package p1;

public class User {
    private String name ="Albir";
    private String surname;
    private int age;

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

    User(){}

    private User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


}