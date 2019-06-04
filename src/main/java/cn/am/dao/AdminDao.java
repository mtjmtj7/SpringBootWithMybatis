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
<<<<<<< HEAD
<<<<<<< HEAD
     * 查询所有授权过期state
=======
=======
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
     * 查询所有不足15天审批state
     * @return
     */
    public List<State> getAllNearEndState();

    /**
     * 查询所有过期审批state
<<<<<<< HEAD
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
     * @return
     */
    public List<State> getAllEndState();

    /**
     * 查询所有所有异常 未通过  过期state
     * @return
     */
    public List<State> getAllRevoke();
=======
     * @return
     */
    public List<State> getAllEndState();
>>>>>>> 810da5ebd5d1b7b53d60cedafb9d4409d3085c12
}
