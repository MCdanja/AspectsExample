package com.example.aspects;

import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void test() {
        Demo demo = new Demo();
        demo.method1();
        System.out.println("");
        demo.methodWithAnnotation();
        System.out.println("");
        demo.methodWithReturn();
        System.out.println("");
        try {
            demo.methodWithException();
        } catch (Exception e) {
            System.out.println("");
        }
        demo.methodToSkip();
        System.out.println("");
        demo.methodWithOneParameter("Some value");
        System.out.println("");
        demo.methodWithTwoParameters(1, 2);
        System.out.println("");
    }
}
