package com.lichun.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lichun.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * Give a provider to make a service implements api interface.
 */
@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
  @Override
  public String sayHello(String name) {
    return "Hello " + name;
  }
}
