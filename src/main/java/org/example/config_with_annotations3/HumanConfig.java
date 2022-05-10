package org.example.config_with_annotations3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Configuration
public class HumanConfig {

    @Bean
    public Pet cat(){
        return new Cat();
    }

    @Bean
    public Pet dog(){
        return new Dog();
    }

    @Bean
    public List<Pet> pets(Pet... pets){
        List<Pet> list = new ArrayList<>();
        Collections.addAll(list, pets);
        return list;
    }

    @Bean
    public Human humanCat(){
        return new Human(cat());
    }

    @Bean
    public Human humanDog(){
        return new Human(dog());
    }

    @Bean
    public Human humanPets(){
        return new Human(pets());
    }
}
