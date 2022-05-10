package org.example.config_with_annotations3;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Human {
    @Value("Tom")
    private String name;
    private Pet pet;
    private List<Pet> petList;

    public Human(Pet pet) {
        this.pet = pet;
    }

    public Human(List<Pet> petList){
        this.petList=petList;
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public List<Pet> getPetList() {
        return petList;
    }
}
