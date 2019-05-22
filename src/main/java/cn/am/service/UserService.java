package cn.am.service;

import cn.am.bean.User;
import cn.am.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
