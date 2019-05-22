package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.User;
import cn.am.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;
    @PostMapping("login")
    public AlexJSONResult login(User user){
        User userNow = userService.login(user);
        System.out.println(userNow);
        if(userNow != null){
            return AlexJSONResult.build(200, "查询成功", userNow);
        }
        else
            return AlexJSONResult.errorMsg("用户名密码错误");
    }
}
