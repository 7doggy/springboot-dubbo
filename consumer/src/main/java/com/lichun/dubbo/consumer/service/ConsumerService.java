package com.lichun.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lichun.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

  @Reference
  private DemoService demoService;

  public String sayHello(String name) {
    return demoService.sayHello(name);
  }
}
