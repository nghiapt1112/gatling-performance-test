package org.gatling.demo.performance.service;

import org.gatling.demo.performance.model.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl {

    public User getUserById(String userId) {
        if (userId == null || userId.length() ==0) {
            userId = UUID.randomUUID().toString();
        }
        User u = new User();
        u.setId(userId);
        u.setLastName("Thao test" + userId);
        u.setDesc1(userId + "desc 1");
        u.setDesc2(userId + "desc 2");
        u.setDesc3(userId + "desc 3");
        u.setDesc4(userId + "desc 4");
        u.setDesc5(userId + "desc 5");

        return u;
    }
}
