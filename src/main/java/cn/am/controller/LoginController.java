package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.User;
import cn.am.service.UserService;
<<<<<<< HEAD
import cn.am.util.Md5Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
=======
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
@SessionAttributes("userNow")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登录验证
     * @param user
     * @return
     */
<<<<<<< HEAD
    @GetMapping("login")
    public AlexJSONResult login(User user, Model model){
        user.setPassword(Md5Token.getInstance().getLongToken(user.getPassword()));
=======
    @PostMapping("login")
    public AlexJSONResult login(User user, Model model){
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
        User userNow = userService.login(user);
        if(userNow != null){
            model.addAttribute("userNow", userNow);
            return AlexJSONResult.build(200, "查询成功", userNow);
        }
        else
            return AlexJSONResult.errorMsg("用户名密码错误");
    }
<<<<<<< HEAD

    /**
     * 登录失败
     * @return
     */
    public AlexJSONResult toLogin(){
        return AlexJSONResult.build(401, "用户名或密码错误。", null);
    }
=======
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
}
