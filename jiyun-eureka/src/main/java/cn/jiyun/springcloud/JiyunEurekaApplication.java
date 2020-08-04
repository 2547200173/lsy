package cn.jiyun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//
public class JiyunEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiyunEurekaApplication.class, args);
    }

}
