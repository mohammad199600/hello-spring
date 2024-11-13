package com.ltp.hello_spring.service;

import com.ltp.hello_spring.Constants;
import com.ltp.hello_spring.User;
import com.ltp.hello_spring.reposidory.UserReposidory;
import java.util.*;

public class UserService {
    UserReposidory userReposidory=new UserReposidory();
  public List<User> getUsers() {
        return userReposidory.getUsers();
    }

    public User getUser(int index) {
        return userReposidory.getUser(index);
    }

    public void addUser(User user) {
       userReposidory.addUser(user);;

    }

    public void updateUser(int index, User user) {
        userReposidory.updateUser(index, user);
    }

    public Integer getIndex(String id) {
        for (int i = 0; i < userReposidory.getUsers().size(); i++) {
            if (userReposidory.getUser(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }
}
