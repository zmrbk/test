package kg.megacom.test.controller;

import jakarta.persistence.Table;
import kg.megacom.test.entity.User;
import kg.megacom.test.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Getter
@Setter
public class UserController {
    private UserService userService;

    @PostMapping(value = "/create-user")
    public User create(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }

    @GetMapping(value = "/get-all-users")
    public List<User> getAll() {
        return this.userService.getUsers();
    }

    @PostMapping(value = "/delete-user")
    public User delete(@PathVariable Long id) {
        this.userService.deleteUser(id);
        return null;
    };
}
