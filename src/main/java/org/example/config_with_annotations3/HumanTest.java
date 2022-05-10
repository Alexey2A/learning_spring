package org.example.config_with_annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HumanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HumanConfig.class);

        context.getBean("humanDog", Human.class).getPet().speak();
        context.getBean("humanCat", Human.class).getPet().speak();

        Human human = context.getBean("humanPets", Human.class);
        System.out.println(human.getName());
        for (Pet p : human.getPetList()){
            p.speak();
        }
    }
}
