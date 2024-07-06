package com.logging.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//ref - https://www.baeldung.com/logback
public class Example {

    private static final Logger logger
            = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        logger.info("Example log from {}", Example.class.getSimpleName());


        String message = "This is a String";
        Integer zero = 0;

        try {
            logger.debug("Logging message: {}", message);
            logger.debug("Going to divide {} by {}", 42, zero);
            int result = 42 / zero;
        } catch (Exception e) {
            logger.error("Error dividing {} by {} ", 42, zero, e);
        }

    }
}