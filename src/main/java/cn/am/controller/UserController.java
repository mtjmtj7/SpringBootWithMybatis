package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.Apply;
import cn.am.bean.State;
import cn.am.bean.User;
import cn.am.service.UserService;
<<<<<<< HEAD
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
<<<<<<< HEAD
@CrossOrigin
@RequestMapping("user")
=======

>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
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
<<<<<<< HEAD
    @GetMapping("getAllState")
=======
    @PostMapping("getAllState")
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    public AlexJSONResult getAllState(User user){
        List<State> list = userService.getAllState(user.getId());
        return AlexJSONResult.build(200, "查询成功",list);
    }

    /**
<<<<<<< HEAD
     * 查询未被授权记录
     * @return
     */
    @GetMapping ("getUntreatedState")
    public AlexJSONResult getUntreatedState(User user){
        List<State> list = userService.getUntreatedState(user.getId());
        return AlexJSONResult.build(200, "用户未授权查询成功",list);
    }

=======
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
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    /**
     * 查询被授权记录
     * @return
     */
<<<<<<< HEAD
    @GetMapping("getAuditedState")
=======
    @PostMapping("getAuditedState")
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    public AlexJSONResult getAuditedState(User user){
        List<State> list = userService.getAuditedState(user.getId());
        return AlexJSONResult.build(200, "用户被授权查询成功",list);
    }

    /**
<<<<<<< HEAD
     * 查询用户授权到期记录
     * @param user
     * @return
     */
    @GetMapping("getEndState")
    public AlexJSONResult getEndState(User user){
        List<State> list = userService.getEndState(user.getId());
        return AlexJSONResult.build(200,"用户授权到期查询成功",list);
    }

    /**\
     * 查询用户授权异常
     * @param user
     * @return
     */
    @GetMapping("getRevoke")
    public AlexJSONResult getRevoke(User user){
        List<State> list = userService.getRevoke(user.getId());
        return AlexJSONResult.build(200,"用户授权异常查询成功",list);
=======
     * 查询未被授权记录
     * @return
     */
    @PostMapping("getUntreatedState")
    public AlexJSONResult getUntreatedState(User user){
        List<State> list = userService.getUntreatedState(user.getId());
        return AlexJSONResult.build(200, "用户未授权查询成功",list);
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    }

    /**
     * 普通用户申请授权
     * @param apply
     * @return
     */
<<<<<<< HEAD
    @GetMapping("addNewApply")
=======
    @PostMapping("addNewApply")
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    public AlexJSONResult addNewApply(Apply apply, HttpSession session){
        userService.addNewApply(apply, session);
        return AlexJSONResult.ok();
    }

<<<<<<< HEAD
    /**
     * 用户重新申请授权三个月
     * @param state
     * @return
     */
    @GetMapping("reApply")
    public AlexJSONResult reApply(State state){

        boolean ret = userService.reApply(state);
        if (ret)
            return AlexJSONResult.ok();
        else
            return AlexJSONResult.errorMsg("更新失败");
    }
=======
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
}
