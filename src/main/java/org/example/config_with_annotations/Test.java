package org.example.config_with_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getName() + " " + person.getSurname());
        person.getCar().driveCare();

        context.close();
    }
}
