package org.example.life_cycle_methods_annotation;


public class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Inside init():");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Inside destroy()");
    }

}
