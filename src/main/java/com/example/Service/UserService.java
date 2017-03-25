package com.example.Service;

import com.example.Dao.UserDao;
import com.example.Dao.UserDaoImpl;
import com.example.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Eric on 3/17/2017.
 */
@Service
public class UserService{

    @Autowired
    @Qualifier("mysql")
    private UserDao userDao;

    public Collection<User> getAllUsers(){

        return this.userDao.getAllUsers();
    }

    public User getUserById(int id){

        return this.userDao.getUserById(id);
    }

    public void removeUserById(int id){

        this.userDao.removeUserById(id);
    }
    public void updateUser(User user){

        this.userDao.updateUser(user);
    }

    public void insertUser(User user){

        this.userDao.insertUser(user);
    }
}
