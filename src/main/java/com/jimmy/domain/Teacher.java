package com.jimmy.domain;

public class Teacher {
    private Integer id;

    private String name;

    private String teaching;

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
        this.name = name == null ? null : name.trim();
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching == null ? null : teaching.trim();
    }
}