package org.example.config_with_annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("truckBean")
public class Truck implements Car{
    @Override
    public void driveCare() {
        System.out.println("ездит на фуре");
    }

    @PostConstruct
    public void init() {
        System.out.println("завести мотор");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Заглушить мотор");
    }
}
