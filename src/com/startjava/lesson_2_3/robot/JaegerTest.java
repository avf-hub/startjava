package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(2.6f);
        jaegerOne.setWeight(1.98f);
        jaegerOne.setPower(8);
        jaegerOne.setArmor(6);
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.attackKaiju();
        System.out.println("Hello, my name is " + jaegerOne.getModelName());

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Coyote Tango");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setHeight(2.8f);
        jaegerTwo.setWeight(2.312f);
        jaegerTwo.setPower(7);
        jaegerTwo.setArmor(4);
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.attackKaiju();
        System.out.println("Hello, my name is " + jaegerTwo.getModelName());
    }
}