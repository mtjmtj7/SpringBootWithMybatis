package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.State;
import cn.am.bean.User;
import cn.am.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 查询所有授权记录
     * @return
     */
    @PostMapping("getAllState")
    public AlexJSONResult getAllState(User user){
        List<State> list = userService.getAllState(user.getId());
        return AlexJSONResult.build(200, "查询成功",list);
    }
}
