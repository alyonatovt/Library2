package com.tovt;

public class Student {
    String name;
    String surname;
    int age;
    String group;

    public Student(String name, String surname, int age, String group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }
void infoStudent(){
    System.out.println("Name:"+ name + " "+ "Surname:"+ surname + " "+ "group:"+ group);
}
public int getAge() {
    return age;
}

}

