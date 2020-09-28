package me.jinwook;

import me.jinwook.chapter4_1.SampleListener;
import me.jinwook.chapter4_2.JinwookProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        //application.setBannerMode(Banner.Mode.OFF);
        application.addListeners(new SampleListener());
        application.run(args);
    }
}
