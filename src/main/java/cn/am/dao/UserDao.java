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
    /**
     * 查询已经被授权记录
     * @param uid
     * @return list
     */
    public List<State> getAuditedState(String uid);

    /**
     * 查询未被授权记录
     * @param uid
     * @return list
     */
    public List<State> getUntreatedState(String uid);

    /**
     * 添加新的申请
     * @param apply
     * @return
     */
    public int addNewApply(Apply apply);
    /**
     * 添加新的申请时创建状态
     * @param state
     * @return
     */
    public int addNewState(State state);
}
