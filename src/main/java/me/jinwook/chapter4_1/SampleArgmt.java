package me.jinwook.chapter4_1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleArgmt {
    public SampleArgmt(ApplicationArguments args) {
        // VM 옵션 (-Dxxx) 으로 들어오는 것은 포함하지 않고,
        // -Dfoo
        // Application (--xxx) 옵션으로 들어오는 것만 포함한다.
        // --bar
        System.out.println("Foo : " + args.containsOption("foo"));
        System.out.println("Bar : " + args.containsOption("bar"));
    }
}
