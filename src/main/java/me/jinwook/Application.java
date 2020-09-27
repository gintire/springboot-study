package me.jinwook;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.setBanner((environment, sourceClass, out) -> {
            out.println("================");
            out.println("aaaaaaa----");
            out.println("================");
        });
        //application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
