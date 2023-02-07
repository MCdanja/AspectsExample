package com.example.aspects;

public class Demo {

    public void method1() {
        System.out.println("In method 1");
    }

    @DemoAnnotation
    public void methodWithAnnotation() {
        System.out.println("In method with annotation");
    }

    public String methodWithReturn() {
        System.out.println("In method with return");
        return "Success";
    }

    public void methodWithException() {
        System.out.println("In method with exception");
        throw new NullPointerException();
    }

    public void methodToSkip() {
        System.out.println("This text should not be displayed");
    }

    public void methodWithOneParameter(String parameter) {
        System.out.println("In method with one parameter, value: " + parameter);
    }

    public void methodWithTwoParameters(Integer parameter1, Integer parameter2) {
        System.out.println("In method with two parameters, value1: " + parameter1 + ", value2: " + parameter2);
    }
}
