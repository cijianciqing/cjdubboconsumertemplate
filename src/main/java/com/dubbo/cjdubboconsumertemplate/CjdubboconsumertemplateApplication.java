package com.dubbo.cjdubboconsumertemplate;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@EnableDubbo
@SpringBootApplication
public class CjdubboconsumertemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CjdubboconsumertemplateApplication.class, args);

    }

}
