package cn.jiyun.service.jiyunserviceconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoadBalanceTest {
    @Autowired
    RibbonLoadBalancerClient client;
    @Test
    public void test(){
        for(int i=0;i<100;i++){
            ServiceInstance serviceInstance = this.client.choose("service-provider");
            System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort());
        }
    }
}
