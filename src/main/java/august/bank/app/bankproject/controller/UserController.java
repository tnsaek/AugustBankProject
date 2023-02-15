package august.bank.app.bankproject.controller;

import august.bank.app.bankproject.Entity.User;
import august.bank.app.bankproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> readAll(){
        return  userService.readAll();
    }

    @GetMapping("/{id}")
    public  User readById(@PathVariable long id){
        return  userService.readById(id);
    }

    @PostMapping
    public void create(@RequestBody User user){
        userService.create(user);
    }

    @PutMapping("/{id}")
    public void updateById(@RequestBody User user,@PathVariable Long id ){
        userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(long id){
        userService.deleteById(id);
    }




}
