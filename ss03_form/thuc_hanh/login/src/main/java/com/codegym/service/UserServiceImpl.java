package com.codegym.service;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkLogin(Login login) {
        List<User> userList = userRepository.getData();
        for (User u : userList)
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        return null;
    }
}
