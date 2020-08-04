package cn.jiyun.service.jiyunserviceconsumer.controller;

import cn.jiyun.service.jiyunserviceconsumer.pojo.User;
import cn.jiyun.service.jiyunserviceconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(@RequestParam("ids")List<Long> ids){
        return this.userService.queryUserById(ids);
    }
}
