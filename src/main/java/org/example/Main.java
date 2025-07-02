package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
        Engine engine = context.getBean("engine", Engine.class);
        System.out.println(engine);
        Transmission transmission =
                context.getBean("transmission", Transmission.class);
        System.out.println(transmission);
        Wheel wheel = context.getBean("wheel", Wheel.class);
        System.out.println(wheel);

    }
}
