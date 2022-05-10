package org.example.config_with_annotations2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.config_with_annotations2")
@PropertySource("classpath:studentApp.properties")
public class StudentConfig {

}
