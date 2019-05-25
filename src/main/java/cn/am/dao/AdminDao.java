package cn.am.dao;

import cn.am.bean.State;

import java.util.List;

public interface AdminDao {
    public List<State> getAllStateNotPass();
    public List<State> getAllPassState();
    public List<State> getAllNearEndState();
    public List<State> getAllEndState();
}
