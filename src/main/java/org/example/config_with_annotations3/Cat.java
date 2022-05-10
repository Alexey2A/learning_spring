package org.example.config_with_annotations3;

public class Cat implements Pet{
    @Override
    public void speak() {
        System.out.println("Meow-meow");
    }
}
