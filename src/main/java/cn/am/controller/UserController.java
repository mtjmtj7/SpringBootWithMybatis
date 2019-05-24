package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.Apply;
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
     * isgrant 是否被授权
     * 0未授权，待授权
     * 1授权，已授权
     * 2授权不足30天
     * 3授权异常
     * @return
     */
    @PostMapping("getAllState")
    public AlexJSONResult getAllState(User user){
        List<State> list = userService.getAllState(user.getId());
        return AlexJSONResult.build(200, "查询成功",list);
    }

    /**
     * 用户重新申请授权
     * @param state
     * @return
     */
    @PostMapping("reApply")
    public AlexJSONResult reApply(State state){

        boolean ret = userService.reApply(state);
        if (ret)
            return AlexJSONResult.ok();
        else
            return AlexJSONResult.errorMsg("更新失败");
    }

    public AlexJSONResult addNewApply(Apply apply){

    }
}
