package com.gdut.imis.service;

import com.gdut.imis.pojo.User;

import java.util.List;

public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    boolean isExist(String NAME);
    User get(String NAME, String password);
}
