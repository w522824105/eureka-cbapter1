package com.my;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

//    打开网址访问：http://localhost:8881/hi，网页显示：
//    foo version 3
//    说明config-client从config-server获取了foo的属性
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}