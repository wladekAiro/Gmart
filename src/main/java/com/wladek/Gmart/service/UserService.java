package com.wladek.Gmart.service;

import com.wladek.Gmart.domain.User;
import com.wladek.Gmart.domain.enumeration.UserRole;

import java.util.List;

/**
 * @author wladek
 */
public interface UserService {

    User addNewUser(User user);

    void login(User user);

    public List<User> findAll();

    public List<User> findByRole(UserRole userRole);

    public User findById(Long id);

    public User activateUser(Long id);

    public User deActivateUser(Long id);
}
