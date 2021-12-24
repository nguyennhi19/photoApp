

package com.codegym.flicker.service.impl;

import com.codegym.flicker.model.User;
import com.codegym.flicker.repository.IUserRepository;
import com.codegym.flicker.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

}
