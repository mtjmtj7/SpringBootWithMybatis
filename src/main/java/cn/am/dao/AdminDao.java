package cn.am.dao;

import cn.am.bean.State;

import java.util.List;

public interface AdminDao {
    /**
     * 查询所有待审批state
     * @return
     */
    public List<State> getAllStateNotPass();

    /**
     * 查询所有已审批state
     * @return
     */
    public List<State> getAllPassState();

    /**
     * 查询所有不足15天审批state
     * @return
     */
    public List<State> getAllNearEndState();

    /**
     * 查询所有过期审批state
     * @return
     */
    public List<State> getAllEndState();
}
