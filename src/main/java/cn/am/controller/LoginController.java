package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.User;
import cn.am.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("userNow")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录验证
     * @param user
     * @return
     */
    @PostMapping("login")
    public AlexJSONResult login(User user, Model model){
        User userNow = userService.login(user);
        if(userNow != null){
            model.addAttribute("userNow", userNow);
            return AlexJSONResult.build(200, "查询成功", userNow);
        }
        else
            return AlexJSONResult.errorMsg("用户名密码错误");
    }
}
