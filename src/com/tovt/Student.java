package com.tovt;

public class Student {
   private String name;
   private String surname;
   private int age;
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
    void infoStudent(String name,String surname,int age){
        System.out.println("Name:"+ name + " "+ "Surname:"+ surname + " "+ "age:"+ age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

