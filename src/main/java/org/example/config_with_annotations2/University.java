package org.example.config_with_annotations2;

import org.springframework.stereotype.Component;

@Component
public class University implements Education {

    @Override
    public void toStudy() {
        System.out.println("учится в университете");
    }
}
