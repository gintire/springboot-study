package me.jinwook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseRunner implements ApplicationRunner {
    @Autowired
    Database database;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(database);
    }
}
