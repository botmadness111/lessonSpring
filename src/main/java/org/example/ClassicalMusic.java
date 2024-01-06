package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
@Scope("prototype")
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInitialization(){
        System.out.println("doing initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doing destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
