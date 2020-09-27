package me.jinwook;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "application.yml")
public class DatabaseConfigTest {
    // given
    @Autowired
    Database database;

    @Test
    public void yamFileTest() {
        // when
        String id = database.getId();
        String ip = database.getIp();

        // then
        assertEquals("rose", id);
        assertEquals("172.21.50.61", ip);
    }
}
