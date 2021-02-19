package io.murad.cms.blog.service;

import io.murad.cms.blog.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User saveUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);

}
