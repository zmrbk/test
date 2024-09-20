package kg.megacom.test.service.impl;

import kg.megacom.test.entity.User;
import kg.megacom.test.repository.UserRepository;
import kg.megacom.test.service.UserService;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User newUser = this.userRepository.save(user);
        return newUser;
    }

    @Override
    public User getUserById(Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }


}
