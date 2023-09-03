package com.ToDoManagement.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say-hello => "Hello! What are you Learning Today?"

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you Learning Today?";
    }
}
