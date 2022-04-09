package com.qt.reflect;

public class Person {
    public String name = "com/qt";
    protected Integer age = 1;
    private Byte gender = 1;
    Boolean isMarried = false;

    private String privateMethod(){
        return "This is private method!";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }

    public Person(String name, Integer age, Byte gender, Boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    public Person() {
    }
}
