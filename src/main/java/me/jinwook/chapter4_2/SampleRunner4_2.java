package me.jinwook.chapter4_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner4_2 implements ApplicationRunner {

    @Value("${jinwook.name}")
    private String name;

    @Value("${jinwook.age}")
    private int age;

    @Value("${jinwook.fullname}")
    private String fullname;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================");
        System.out.println("name : "+ name);
        System.out.println("age : " + age);
        System.out.println("full name: " + fullname);
        System.out.println("==================");
    }
}
