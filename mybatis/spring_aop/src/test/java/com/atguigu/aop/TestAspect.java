package com.atguigu.aop;

import com.atguigu.aop.annotation.Calculator;
import com.atguigu.aop.annotation.CalculatorPureImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {
    @Test
    public void testAspect() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextAOP.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int result = calculator.add(1, 1);
        System.out.println(result);
    }


}
