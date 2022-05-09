package org.example.config_with_annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Roadster implements Car {
    @Override
    public void driveCare() {
        System.out.println("ездит на родстере");
    }

    @PostConstruct
    public void init() {
        System.out.println("завести мотор");
    }
}
