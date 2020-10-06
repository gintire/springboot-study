package me.jinwook.chapter4_3_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleLoggingRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleLoggingRunner.class);


    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("==============");
        logger.info("hello info");
        logger.info("==============");

        logger.debug("==============");
        logger.debug("hello debug");
        logger.debug("==============");
    }
}
