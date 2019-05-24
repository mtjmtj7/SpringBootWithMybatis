package cn.am.service;

import cn.am.bean.Apply;
import cn.am.bean.State;
import cn.am.bean.User;
import cn.am.dao.UserDao;
import cn.am.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

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

        apply.setApplyid(s.getApplyid());
        apply.setGrantbegindate(startTime);
        apply.setGrantenddate(endTime);
        int res2 = userDao.updateApply(apply);
        if(res1 > 0 && res2 >0)
            return true;
        else
            return false;
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
     * 查询该用户未被授权
     * @param uid
     * @return
     */
    public List<State> getUntreatedState(String uid){
        return userDao.getUntreatedState(uid);
    }
}
