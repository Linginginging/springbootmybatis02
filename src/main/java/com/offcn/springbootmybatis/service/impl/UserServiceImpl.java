package com.offcn.springbootmybatis.service.impl;

import com.offcn.springbootmybatis.dao.UserDao;
import com.offcn.springbootmybatis.pojo.User;
import com.offcn.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUserList() {
        return userDao.getAll();
    }

    @Override
    public void createUser(User user) {
    userDao.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
    userDao.update(user);
    }

    @Override
    public void deleteUser(Long id) {
    userDao.delete(id);
    }
}
