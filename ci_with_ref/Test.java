package org.example.ci_with_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ci_with_reference config.xml");
        Student s=(Student) context.getBean("stud_ref");
        System.out.println(s);
    }
}
