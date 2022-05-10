package org.example.config_with_annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.surname}")
    private String surname;

    private Education education;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Education getEducation() {
        return education;
    }

    @Autowired
    public void setEducation(@Qualifier("college") Education education) {
        this.education = education;
    }

    @PostConstruct
    protected void init(){
        System.out.println("рано проснулся");
    }

    @PreDestroy
    protected void destroy(){
        System.out.println("спокойной ночи");
    }
}
