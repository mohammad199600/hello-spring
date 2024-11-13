package com.ltp.hello_spring.reposidory;

import com.ltp.hello_spring.User;
import java.util.*;

public class UserReposidory {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return this.users;
    }

    public User getUser(int index) {
        return users.get(index);
    }

    public void addUser(User user) {
        users.add(user);

    }

    public void updateUser(int index, User user) {
        users.set(index, user);
    }

}
