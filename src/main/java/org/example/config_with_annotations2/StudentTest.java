package org.example.config_with_annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean("student", Student.class);
        System.out.println(student.getName() + " " + student.getSurname());
        student.getEducation().toStudy();

        context.close();
    }
}
