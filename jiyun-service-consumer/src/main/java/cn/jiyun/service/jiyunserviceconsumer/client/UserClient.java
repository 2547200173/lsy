package cn.jiyun.service.jiyunserviceconsumer.client;

import cn.jiyun.service.jiyunserviceconsumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider",fallback = UserClientFallBack.class)
public interface UserClient {
    @GetMapping("user/{id}")
    User queryById(@PathVariable("id")Long id);
}
