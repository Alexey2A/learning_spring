package org.example.config_with_annotations3;

public class Dog implements Pet{
    @Override
    public void speak() {
        System.out.println("woof-woof");
    }
}
