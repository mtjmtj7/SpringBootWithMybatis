package cn.am.service;

import cn.am.bean.Apply;
import cn.am.bean.State;
import cn.am.bean.User;
import cn.am.dao.UserDao;
import cn.am.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
<<<<<<< HEAD
import java.util.Random;
=======
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12

@Service
@Transactional
public class UserService {
<<<<<<< HEAD
    @Autowired
    private UserDao userDao;
=======

    @Autowired
    private UserDao userDao;

>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    /**
     * 登录验证
     */
    public User login(User u){
        return userDao.login(u);
    }

    /**
     * 查询该用户所有授权
     * @param uid
     * @return
     */
    public List<State> getAllState(String uid){
        return userDao.getAllState(uid);
    }

    /**
<<<<<<< HEAD
     * 查询该用户未被授权
     * @param uid
     * @return
     */
    public List<State> getUntreatedState(String uid){
        return userDao.getUntreatedState(uid);
    }

    /**
     * 查询该用户已经被授权
     * @param uid
     * @return
     */
    public List<State> getAuditedState(String uid){
        return userDao.getAuditedState(uid);
    }

    /**
     * 查询该用户过期授权
     * @param uid
     * @return
     */
    public List<State> getEndState(String uid){return userDao.getEndState(uid);}

    public List<State> getRevoke(String uid){return userDao.getRevoke(uid);}



    /**
=======
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
     * 重新申请授权三个月
     * 修改授权状态为未授权
     * 修改apply起始时间
     * @param state
     * @return
     */
    public boolean reApply(State state){
        //修改状态改为0未授权
        State s = userDao.selectStateByID(state.getSid());
        s.setSid(state.getSid());
        s.setIsgrant("0");
        int res1 = userDao.updateState(s);
<<<<<<< HEAD
=======

>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
        //修改apply起始时间
        Apply apply = new Apply();
        String startTime = DateUtil.dateToSimpleStr(new Date());
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sf.parse(startTime);
        }catch (Exception e){
            e.printStackTrace();
        }
        c.setTime(date);
        c.add(Calendar.MONTH, 3);   //增加三个月
        String endTime = sf.format(c.getTime());
<<<<<<< HEAD
=======

>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
        apply.setApplyid(s.getApplyid());
        apply.setGrantbegindate(startTime);
        apply.setGrantenddate(endTime);
        int res2 = userDao.updateApply(apply);
        if(res1 > 0 && res2 >0)
            return true;
        else
            return false;
    }
<<<<<<< HEAD
=======
    /**
     * 查询该用户已经被授权
     * @param uid
     * @return
     */
    public List<State> getAuditedState(String uid){
        return userDao.getAuditedState(uid);
    }

    /**
     * 查询该用户未被授权
     * @param uid
     * @return
     */
    public List<State> getUntreatedState(String uid){
        return userDao.getUntreatedState(uid);
    }
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12

    /**
     * 添加新的申请
     * 1.apply添加记录
     * 2.状态表添加未授权状态
     * @param apply
     * @return
     */
    public boolean addNewApply(Apply apply, HttpSession session){

        //获取用户ID
        User userNow = (User)session.getAttribute("userNow");
        //apply
        //记得改
        //apply.setApplyername(userNow.getRealname());
<<<<<<< HEAD

        apply.setApplyername("用户公司" );
=======
        apply.setApplyername("mtjmtj7");
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
        int ret1 = userDao.addNewApply(apply);
        //state
        State state = new State();
        state.setApplyid(apply.getApplyid());
        //记得改
        //state.setUid(userNow.getId());
<<<<<<< HEAD

        state.setUid("3");
=======
        state.setUid("2");
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
        state.setIsgrant("0"); //未授权
        state.setIsdel("0"); //0是正常
        int ret2 = userDao.addNewState(state);
        if(ret1 > 0 && ret2 > 0)
            return true;
        else
            return false;

    }
<<<<<<< HEAD
=======

>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
}
