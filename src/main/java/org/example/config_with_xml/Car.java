package org.example.config_with_xml;

abstract public class Car implements Drive {

    public void init() {
        System.out.println("завести мотор");
    }

    public void destroy() {
        System.out.println("Заглушить мотор");
    }
}
