package cn.jiyun.service.userservice.controller;

import cn.jiyun.service.userservice.pojo.User;
import cn.jiyun.service.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;
    @GetMapping("{id}")
    public User queryById(@PathVariable("id")Long id){
        System.out.println("port:"+port);
        return this.userService.queryById(id);
    }
}
