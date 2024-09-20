package kg.megacom.test.service;

import kg.megacom.test.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
    List<User> getUsers();
}
