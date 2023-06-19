package com.yuyun.yuapigateway;

import com.yuyun.yuapi.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableDubbo
@Service
public class YuapiGatewayApplication {

    @DubboReference
    private DemoService demoService;
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(YuapiGatewayApplication.class, args);
        YuapiGatewayApplication application = context.getBean(YuapiGatewayApplication.class);
        String result = application.doSayHello("world");
        String result2 = application.doSayHello2("world");
        System.out.println("result: " + result);
        System.out.println("result: " + result2);
    }

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }

    public String doSayHello2(String name) {
        return demoService.sayHello2(name);
    }

}