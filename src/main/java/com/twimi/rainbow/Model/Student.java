package com.twimi.rainbow.Model;

import lombok.Data;

@Data
public class Student {
    private String id;
    private String name;

    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id:%s",id);
    }
}
