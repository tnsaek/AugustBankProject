package august.bank.app.bankproject.controller;

import august.bank.app.bankproject.dto.UserDto;
import august.bank.app.bankproject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<UserDto> readAll() {
        return userService.readAll();
    }

    @GetMapping("/{id}")
    public UserDto readById(@PathVariable String id) {
        return userService.readById(id);
    }

    @PostMapping("")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @PutMapping("/{id}")
    public UserDto updateById(@RequestBody UserDto userDto, @PathVariable String id) {
        return userService.update(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        userService.deleteById(id);
    }


}
