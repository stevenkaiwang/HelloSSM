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
//        Student studentOne = (Student) ac.getBean("StudentOne");
//        Student studentOne = ac.getBean("StudentOne", Student.class);
        Person studentOne = ac.getBean(Person.class);
        System.out.println(studentOne);
        System.out.println(studentOne instanceof Person);


    }
}
