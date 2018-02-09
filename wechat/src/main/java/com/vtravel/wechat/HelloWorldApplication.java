package com.vtravel.wechat;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = { "com.vtravel.wechat" })
public class HelloWorldApplication {

    public static void main(String[] args) {
	SpringApplication.run(HelloWorldApplication.class, args);
    }

    /**
     * Method called by spring to instantiate a bean of {@link AtomicLong}<br/>
     * {@link Bean @Bean} annotation will be detected by spring, and spring then
     * registers this instance as a bean in container.
     * 
     * @return {@link AtomicLong}
     */
    @Bean
    public AtomicLong getAtomicLong() {
	return new AtomicLong();
    }
}