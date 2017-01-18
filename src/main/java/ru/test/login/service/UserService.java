package ru.test.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.test.login.model.User;
import ru.test.login.repository.UserRepository;

/**
 * Created by igor on 15.01.17.
 */
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
