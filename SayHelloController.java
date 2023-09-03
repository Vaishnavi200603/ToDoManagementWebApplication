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

    @RequestMapping("sgitay-hello-html")
    @ResponseBody
    public String sayHelloHTML(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<p> My first HTML page with body </p>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}

 
