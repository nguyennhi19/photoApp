

package com.codegym.flicker.service;

import com.codegym.flicker.model.User;

public interface IUserService {
    Iterable<User> findAll();

    User findById(Long id);

    void save(User user);

    void remove(Long id);

    User getUserByEmail(String email);

}
