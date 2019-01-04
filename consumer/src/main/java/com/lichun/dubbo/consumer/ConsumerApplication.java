package com.lichun.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.lichun.dubbo.consumer.service.ConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubboConfiguration
@SpringBootApplication
public class ConsumerApplication {
  public static ConfigurableApplicationContext context;
  public static void main(String[] args) {
    context = SpringApplication.run(ConsumerApplication.class, args);
    ConsumerService consumerService = (ConsumerService) context.getBean("consumerService");
    String value = consumerService.sayHello("GeGe");
    System.out.println("value = " + value);
  }

}

