package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
public class Aspects {

//*
    @Pointcut("execution(public * com.example.aspects.Demo.*(..))")
    public void callAtDemo() {}

    @Before("callAtDemo()")
    public void beforeAllDemoMethods(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    @After("callAtDemo()")
    public void afterAllDemoMethods(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }
//*/

/*
    @Pointcut("@annotation(DemoAnnotation) && execution(* *(..))")
    public void callAtDemoAnnotation() {}

    @Before("callAtDemoAnnotation()")
    public void beforeDemoAnnotationMethods(JoinPoint joinPoint) {
        System.out.println("Before method with annotation: " + joinPoint.getSignature().getName());
    }
//*/

/*
    @Around("execution(public * com.example.aspects.Demo.method1())")
    public void aroundDemoMethod1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method 1");
        joinPoint.proceed();
        System.out.println("After method 1");
    }
//*/

/*
    @AfterReturning(pointcut="execution(* com.example.aspects.Demo.methodWithReturn())", returning="returningValue")
    public void afterDemoMethodWithReturn(String returningValue) {
        System.out.println("Returning value is: " + returningValue);
    }
//*/

/*
    @AfterThrowing(pointcut = "execution(* com.example.aspects.Demo.methodWithException())", throwing = "exception")
    public void afterDemoMethodWithException(Throwable exception) {
        System.out.println("After method with exception");
        System.out.println("Exception: " + exception);
    }
//*/

/*
    @Around("execution(public * com.example.aspects.Demo.methodToSkip())")
    public void aroundDemoMethodToSkip(JoinPoint joinPoint) {
        System.out.println("Skip method: " + joinPoint.getSignature().getName());
    }
//*/
/*
    @Pointcut("execution(public * com.example.aspects.Demo.methodWithOneParameter(..)) || execution(public * com.example.aspects.Demo.methodWithTwoParameters(..))")
    public void callAtDemoMethodsWithParameters() {}
/*
    @Before("callAtDemoMethodsWithParameters()")
    public void beforeDemoMethodsWithParameters(JoinPoint joinPoint) {
        String args = Arrays.stream(joinPoint.getArgs())
                .map(a -> a.toString())
                .collect(Collectors.joining(","));
        System.out.println("Ready to call method: " + joinPoint.getSignature().getName() + " with parameters: " + args);
    }
//*/
/*
    @Before("callAtDemoMethodsWithParameters() && args(value)")
    public void beforeDemoMethodWithOneParameter(String value) {
        System.out.println("Before method with one parameter: " + value);
    }

    @Before("callAtDemoMethodsWithParameters() && args(value1, value2)")
    public void beforeDemoMethodWithOneParameter(Integer value1, Integer value2) {
        System.out.println("Before method with two parameters: " + value1 + ", " + value2);
    }
//*/
}
