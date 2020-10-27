package me.jinwook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/config/application.yml")
@ActiveProfiles("test")
@SpringBootTest
public class ExternalSettingsTest {
    @Autowired
    Environment environment;


    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("jinwook.name"))
                .isEqualTo("gintire");
    }
}
