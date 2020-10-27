package me.jinwook.chapter4_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner4_2 implements ApplicationRunner {

    @Autowired
    JinwookProperties jinwookProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================");
        System.out.println("name : "+ jinwookProperties.getName());
        System.out.println("age : " + jinwookProperties.getAge());
        System.out.println("full name: " + jinwookProperties.getFullname());
        System.out.println("Session Timeout: "+ jinwookProperties.getSessionTimeout());
        System.out.println("==================");
    }
}
