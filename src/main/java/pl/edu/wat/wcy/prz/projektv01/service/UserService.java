package pl.edu.wat.wcy.prz.projektv01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.UserDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.UserEntity;
import pl.edu.wat.wcy.prz.projektv01.model.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity addUser(UserDTO dto){

        String username = dto.getUsername();
        String password = dto.getPassword();
        String role = dto.getRole();

        if (userRepository.findByUsername(username) != null){
            throw new IllegalArgumentException("User already exists!");
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername(username);
        userEntity.setPassword(password);
        userEntity.setRole(role);

        return userRepository.save(userEntity);
    }

    public List<UserEntity> listAllUsers() {return userRepository.findAll();}

}
