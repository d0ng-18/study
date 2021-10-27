package com.slayerd05.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class People {
    private String name;
    @Autowired
    private Dog dog;
    @Autowired
    //@Resource(name = "xxx")
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" + name + "的" + '\'' +
                "狗：" + dog +
                "猫：" + cat +
                '}';
    }
}
