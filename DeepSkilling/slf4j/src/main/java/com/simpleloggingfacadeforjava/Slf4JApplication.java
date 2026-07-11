package com.simpleloggingfacadeforjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4JApplication {

    private static final Logger log =
            LoggerFactory.getLogger(Slf4JApplication.class);

    public static void main(String[] args) {

        log.error("error");

        log.warn("warning");
    }
}