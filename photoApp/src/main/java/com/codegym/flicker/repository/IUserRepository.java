
package com.codegym.flicker.repository;

import com.codegym.flicker.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<User, Long> {

    User getUserByEmail(String email);

}
