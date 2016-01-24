package com.mkyong.helloworld.config;
/*
 * http://www.mkyong.com/spring-mvc/gradle-spring-4-mvc-hello-world-example-annotation*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.mkyong.helloworld.service" })
public class SpringRootConfig {
}