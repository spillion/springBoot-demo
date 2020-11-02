package com.example.demo.controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@RestController
public class helloWorld {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(request.getQueryString());
        return "hello";
    }
}
