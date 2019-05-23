package cn.am.service;

import cn.am.bean.State;
import cn.am.bean.User;
import cn.am.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
