package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("car", Car.class);
        Car car1 = context.getBean("car", Car.class);
        System.out.println(car.getEngine() == car1.getEngine());
        System.out.println(car.getWheel() == car1.getWheel());


    }
}
