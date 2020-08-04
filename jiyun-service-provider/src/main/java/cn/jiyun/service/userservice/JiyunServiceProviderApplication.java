package cn.jiyun.service.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端
public class JiyunServiceProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(JiyunServiceProviderApplication.class, args);
    }

}
