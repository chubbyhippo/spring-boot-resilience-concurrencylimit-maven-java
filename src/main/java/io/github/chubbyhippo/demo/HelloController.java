package io.github.chubbyhippo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	@GetMapping("/hello")
    @ConcurrencyLimit(1)
	public String hello() throws InterruptedException {
        Thread.sleep(5000);
        log.info("Hello World!");
		return "Hello World!";
	}
}
