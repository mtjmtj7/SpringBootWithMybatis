package cn.am.service;

import cn.am.bean.State;
import cn.am.dao.AdminDao;
import cn.am.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserDao userDao;
    /**
     * 查询所有未授权的state
     */
    public List<State> getAllStateNotPass(){
        return adminDao.getAllStateNotPass();
    }
    /**
     * 查询所有正常的state
     */
    public List<State> getAllPassState(){
        return adminDao.getAllPassState();
    }
    /**
<<<<<<< HEAD
     * 查询所有授权过期state
     */
    public List<State> getAllEndState(){
        return adminDao.getAllEndState();
    }
    /**
     * 查询所有异常 未通过  过期state
     */
    public List<State> getAllRevoke(){
        return adminDao.getAllRevoke();
=======
     * 查询所有不足15天的state
     */
    public List<State> getAllNearEndState(){
        return adminDao.getAllNearEndState();
    }
    /**
     * 查询所有授权过期的state
     */
    public List<State> getAllEndState(){
        return adminDao.getAllEndState();
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
    }
    /**
     * 批准授权
     */
    public boolean ratify(State s){
        int ret =  userDao.updateState(s);
        if (ret > 0)
            return true;
        else
            return false;
    }
<<<<<<< HEAD

    /**
     * 取消授权
     */
    public boolean unratify(State s){
        int ret =  userDao.updateState(s);
        if (ret > 0)
            return true;
        else
            return false;
    }
}
=======
}
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
