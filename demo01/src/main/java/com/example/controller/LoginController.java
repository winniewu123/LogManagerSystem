package com.example.controller;

import com.example.dao.UserRepository;
import com.example.model.ResponseBean;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxiaodong on 2017/4/9.
 */
@RestController // 注册为和页面的交互接口
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping (value = "login.do", method = RequestMethod.POST)  //把这个方法注册成为一个post接口
    public ResponseBean login(@RequestBody User user){
        ResponseBean responseBean = new ResponseBean();
        if(StringUtils.isEmpty(user.getUsername())){
            responseBean.setRetCode("0001");
            responseBean.setRetMsg("用户名不能为空");
            return responseBean;
        }

        User userDb = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (null == userDb)
        {
            responseBean.setRetCode("0001");
            responseBean.setRetMsg("用户名或密码不正确");
            return responseBean;
        }


        responseBean.setRetCode("0000");
        responseBean.setRetMsg("登录成功");
        Map<String, String> result = new HashMap<>();
        result.put("url", "main.html");
        responseBean.setResult(result);
        return responseBean;
    }
}
