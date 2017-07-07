package com.example.demo.entity;

/**
 * Created by com.huizhi.edu.show.MybatisCodeGenerate on 2017-06-06
 */
public class BaseUser implements java.io.Serializable {

   private String name;

   private Integer age;

   private Integer height;

   private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}