package com.company;

public class People {
    private String name;
    private Integer age;
    private Sex sex;

    People (String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }
}
