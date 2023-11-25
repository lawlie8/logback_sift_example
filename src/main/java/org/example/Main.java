package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

         Logger logger = LoggerFactory.getLogger(Main.class);
        MDC.put("userid", "head-1");
        logger.info("asdasd");
        MDC.remove("logFileName");
    }
}