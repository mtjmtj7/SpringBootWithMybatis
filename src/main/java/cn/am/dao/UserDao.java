package cn.am.dao;

import cn.am.bean.Apply;
import cn.am.bean.State;
import cn.am.bean.User;

import java.util.List;

public interface UserDao {
    public User login(User user);
    public List<State> getAllState(String uid);
    public int updateState(State state);
    public int updateApply(Apply apply);
    public Apply selectApplyByID(String aid);
    public State selectStateByID(String sid);
    public int addNewApply(Apply apply);
}
