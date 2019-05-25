package cn.am.controller;

import cn.am.bean.AlexJSONResult;
import cn.am.bean.State;
import cn.am.bean.User;
import cn.am.service.AdminService;
import cn.am.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    /**
     * 管理员首页-待处理 查询所有未授权的state isgrant=0
     * @return list-state[state的字段，userDetail，applyDetail]
     */
    @PostMapping("getAllStateNotPass")
    public AlexJSONResult getAllStateNotPass(){
        List<State> list = adminService.getAllStateNotPass();
        return AlexJSONResult.build(200, "查询成功", list);
    }
    /**
     * 管理员首页-已审核 查询所有正常的state  isgrant=1
     * @return list-state[state的字段，userDetail，applyDetail]
     */
    @PostMapping("getAllPassState")
    public AlexJSONResult getAllPassState(){
        List<State> list = adminService.getAllPassState();
        return AlexJSONResult.build(200, "查询成功", list);
    }
    /**
     * 管理员首页-授权过期 查询所有不足15天的state  isgrant=2
     * @return list-state[state的字段，userDetail，applyDetail]
     */
    @PostMapping("getAllNearEndState")
    public AlexJSONResult getAllNearEndState(){
        List<State> list = adminService.getAllNearEndState();
        return AlexJSONResult.build(200, "查询成功", list);
    }
    /**
     * 管理员首页-注销 查询所有授权异常的state  isgrant=2
     * @return list-state[state的字段，userDetail，applyDetail]
     */
    @PostMapping("getAllEndState")
    public AlexJSONResult getAllEndState(){
        List<State> list = adminService.getAllNearEndState();
        return AlexJSONResult.build(200, "查询成功", list);
    }

    /**
     * 管理员批准授权
     * @param sid state->sid
     * @param applyid state->applyid
     * @return
     */

    @PostMapping("ratify")
    public AlexJSONResult ratify(String sid, HttpSession session){
        //授权人ID
//      User adminNow = (User)session.getAttribute("userNow");
//      String aid = adminNow.getId();
        String aid = "2";
        String isgrant = "1";
        String grantdate = DateUtil.dateToSimpleStr(new Date());
        String license = "123456";

        State s = new State();
        s.setSid(sid);
        s.setAid(aid);
        s.setIsgrant(isgrant);
        s.setGrantdate(grantdate);
        s.setLicense(license);
        System.out.println(s.toString());
        boolean ret = adminService.ratify(s);
        if (ret){
            return AlexJSONResult.ok();
        }
        else {
            return AlexJSONResult.errorMsg("授权失败。");
        }
    }
}
