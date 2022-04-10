package com.qt.reflect;

public class Person1 {
    public String name;
    protected Integer age1;
    private Byte gender;
    Boolean isMarried1;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age1 +
                ", gender=" + gender +
                ", isMarried=" + isMarried1 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge1() {
        return age1;
    }

    public void setAge1(Integer age1) {
        this.age1 = age1;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Boolean getMarried() {
        return isMarried1;
    }

    public void setMarried(Boolean married) {
        isMarried1 = married;
    }

    public Person1(String name, Integer age, Byte gender, Boolean isMarried) {
        this.name = name;
        this.age1 = age;
        this.gender = gender;
        this.isMarried1 = isMarried;
    }

    public Person1() {
    }
}
