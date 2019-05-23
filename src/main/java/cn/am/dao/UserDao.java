package cn.am.dao;

import cn.am.bean.State;
import cn.am.bean.User;

import java.util.List;

public interface UserDao {
    public User login(User user);

    /**
     * 查询所有授权记录
     * @param uid
     * @return list
     */
    public List<State> getAllState(String uid);
}
