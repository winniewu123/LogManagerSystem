package com.example.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by wuxiaodong on 2017/5/9.
 */
@RestController
@RequestMapping("/guowang/demoAPI")
public class DemoAPI {
    @RequestMapping(value = "/getDemo/{username}",method = RequestMethod.GET)
    public String getDemo(@PathVariable String username){
        String i="qqqqq";
        username+=i;
        return "your input data is :" +username;
    }
    public static  int count=0;
    @RequestMapping(value = "/postDemo",method = RequestMethod.POST)
    public String postDemo(@RequestParam String username){
        count++;
        String result="接口是第"+count
        +"次被调用，您的用户名是"+username;
        return result;
    }

    @RequestMapping(value = "/postJason",method = RequestMethod.POST)
    public @ResponseBody
    Student  postDemo(@RequestBody Student s){
        Student student=new Student();
        student.name=s.name;
        student.clazz="22";
        return student;
    }

}
