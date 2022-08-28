package com.atguigu.pring.test;

import com.atguigu.pring.pojo.HelloSpring;
import com.atguigu.pring.pojo.Person;
import com.atguigu.pring.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
//    @Test
//    public void testHelloSping(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloSpring helloSpring = (HelloSpring) context.getBean("HelloSpring");
//        helloSpring.sayHello();
//    }

    @Test
    public void testIOC(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student studentOne = (Student) ac.getBean("studentOne");
//        Student studentOne = ac.getBean("studentOne", Student.class);
        Student studentTwo = ac.getBean("studentTwo", Student.class);
//        Person studentOne = ac.getBean(Person.class);

        System.out.println(studentTwo);
        System.out.println(studentTwo instanceof Person);
        System.out.println(studentTwo.getGender() == null);

    }
}
