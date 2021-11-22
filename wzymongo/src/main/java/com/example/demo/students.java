package com.example.demo;/*
 *@Auther: wzy
 *@Date:2021/11/12 -11-12
 *@Descreption: com.wzy
 *@Version: 1.0
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
public class students {
    @Id
    private String id;
    private String name;
    private String psw;
    private Integer age;

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", psw='" + psw + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
