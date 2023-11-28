package com.example.skander.Controller;

import com.example.skander.Entities.User;
import com.example.skander.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
     UserService userService;

    @PostMapping("/add")
    public User AddUser( @RequestBody  User user){
        return this.userService.AddUser(user);
      }
      @GetMapping("/get-user_id/{id}")
    public User getUserById(@PathVariable("id") long id){
        return this.userService.getUserbyId(id);
      }
      @GetMapping("all-user")
    public List<User> getAllUsers(){
        return this.userService.getAllUser();
      }

}
