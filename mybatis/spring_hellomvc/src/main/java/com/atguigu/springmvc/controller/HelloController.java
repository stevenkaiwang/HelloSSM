package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    // @RequestMapping注解:处理请求和控制器方法之间的映射关系
    // @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径 //localhost:8080/springMVC/
    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @GetMapping(
            value = {"/test", "/samecontrollertest"},
            params = {"username", "password=123"},
            headers = {"Referer=http://localhost:8080/spring_hellomvc/"}
    )
    public String testRequestMappingValue(){
        return "success";
    }
    @RequestMapping("/testGetPathParam/{id}/{name}")
    public String testGetPathParam(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println("id = " + id + " name = " + name);
        return "success";
    }

    @RequestMapping("/testGetParam")
    public String testGetParam(String name, String pwd) {
        System.out.println("name = " +  name + " pwd = " + pwd);
        return "success";
    }

    @RequestMapping("/testGetParam2")
    public String testGetParam2(@RequestParam(value = "name") String username,
                                @RequestParam(value = "pwd",required = true, defaultValue = "password") String password,
                                @RequestHeader(value = "Referer") String referer,
                                @CookieValue(value = "JSESSIONID") String sessionId
    ) {
        System.out.println("username = " +  username + " password = " + password);
        System.out.println("Referer = " + referer);
        System.out.println("SESSIONID = " + sessionId);
        return "success";
    }

    @RequestMapping("/testpojo")
    public String testpojo(User user){
        System.out.println(user);
        return "success";
    }
}
