package com.atguigu.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.atguigu.aop.annotation.CalculatorPureImpl.*(..))")
    public void pointcut() {
    }

    @Before("execution(* com.atguigu.aop.annotation.CalculatorPureImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("logger before method: " + methodName + "with args: " + args);
    }
    @AfterReturning(value = "execution(* com.atguigu.aop.annotation.CalculatorPureImpl.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("log after returning result. result is " + result);
    }
    @After("pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("log in finally section");
    }
    @AfterThrowing(value = "pointcut()", throwing = "ex")
    public void exceptionMethod(JoinPoint joinPoint, Throwable ex) {
    System.out.println("log in catch section, exception: " + ex);
    }

    @Around("pointcut()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        String methodName = proceedingJoinPoint.getSignature().getName();
        String args = Arrays.toString(proceedingJoinPoint.getArgs());
        System.out.println("Around:　logger before method: " + methodName + "with args: " + args);
        Object result = null;
        try {
            result = (Integer)proceedingJoinPoint.proceed();
            System.out.println("Around:　log after returning result. result is " + result);
        } catch (Throwable e) {
            System.out.println("Around:　log in catch section, exception: " + e);
            throw new RuntimeException(e);
        } finally {
            System.out.println("Around:　log in finally section");
        }
        System.out.println("Around:　log around the proxy method. ");
        return result;
    }
}
