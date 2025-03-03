package com.example.SpringBoot2.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringBootController {
    private static final Logger logger = LoggerFactory.getLogger(SpringBootController .class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.trace("TRACE: Handling /api/hello request");
        logger.debug("DEBUG: Processing /api/hello request");
        logger.info("INFO: Sending response for /api/hello");
        logger.warn("WARN: This is just a warning example");
        logger.error("ERROR: No actual error, just demonstration");
        return "Hello, Spring Boot with SLF4J!";
    }
}
