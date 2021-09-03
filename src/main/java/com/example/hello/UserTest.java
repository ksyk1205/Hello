package com.example.hello;

public class UserTest {
    private String name;
    private int age;

    public UserTest(){
        this.name = null;
        this.age = 0;
    }

    public UserTest(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
