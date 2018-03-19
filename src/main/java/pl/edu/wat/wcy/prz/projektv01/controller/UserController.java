package pl.edu.wat.wcy.prz.projektv01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.UserDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.UserEntity;
import pl.edu.wat.wcy.prz.projektv01.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    UserEntity addUser(@RequestBody @Validated UserDTO dto){
        return userService.addUser(dto);
    }

    @GetMapping("/list")
    List<UserEntity> listAllUsers(){
        return userService.listAllUsers();
    }

}
