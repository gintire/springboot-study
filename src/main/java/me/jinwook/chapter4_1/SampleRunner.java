package me.jinwook.chapter4_1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SampleRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Foo_Runner : " + args.containsOption("foo"));
        System.out.println("Bar_Runner : " + args.containsOption("bar"));
    }
}
