package org.example.prototype_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("prototype_scope config.xml");
        Student s=context.getBean("student",Student.class);
        System.out.println(s);
        System.out.println(s.hashCode());

        Student s1=context.getBean("student",Student.class);
        System.out.println(s1.hashCode());
    }
}
