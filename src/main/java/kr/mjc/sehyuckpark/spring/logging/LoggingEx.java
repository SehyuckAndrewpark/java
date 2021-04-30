package kr.mjc.sehyuckpark.spring.logging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingEx {

    public static void main(String[] args) {
        log.trace("Logger Avatar : {}", log.getClass().getName());
        log.debug("Logger Avatar : {}", log.getClass().getName());
        log.info("Logger Avatar : {}", log.getClass().getName());
        log.error("Logger Avatar : {}", log.getClass().getName());
        log.debug("Logger Avatar : " + log.getClass().getName());
    }
}