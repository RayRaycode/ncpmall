package com.gdut.imis.service.impl;

import com.gdut.imis.mapper.UserMapper;
import com.gdut.imis.pojo.User;
import com.gdut.imis.pojo.UserExample;
import com.gdut.imis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User u) {
        userMapper.insert(u);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User u) {
        userMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> list(){
        UserExample example =new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example);

    }
    @Override
    public boolean isExist(String NAME) {
        UserExample example =new UserExample();
        example.createCriteria().andNAMEEqualTo(NAME);
        List<User> result= userMapper.selectByExample(example);
        if(!result.isEmpty())
            return true;
        return false;

    }
    public User get(String NAME, String password) {
        UserExample example =new UserExample();
        example.createCriteria().andNAMEEqualTo(NAME).andPasswordEqualTo(password);
        List<User> result= userMapper.selectByExample(example);
        if(result.isEmpty())
            return null;
        return result.get(0);
    }
}
