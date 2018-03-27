package pl.edu.wat.wcy.prz.projektv01.view;

import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.UserDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.UserEntity;
import pl.edu.wat.wcy.prz.projektv01.model.repository.UserRepository;

import javax.swing.*;

public class LoginWindow extends JFrame{

    @Autowired
    private UserRepository userRepository;

    public UserEntity loginUser(UserDTO dto, JPasswordField passwordField){

        UserEntity userEntity = userRepository.findByUsername(dto.getUsername());

        char[] pass = passwordField.getPassword();

        String passField = new String(pass);

        if (dto.getPassword() != passField){
            throw new IllegalArgumentException("Password is incorrect!");
        }

        if (dto.getPassword() == passField){

        }

        return userRepository.save(userEntity);

    }

    public LoginWindow(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton confirmButton = new JButton("Zaloguj");
        confirmButton.setBounds(130, 140, 80, 40);

        int passHeight = 90;
        int loginHeight = 50;

        JLabel mainLabel = new JLabel();
        mainLabel.setText("Logowanie");
        mainLabel.setBounds(130, 10, 100, 20);

        JLabel loginLabel = new JLabel();
        loginLabel.setText("Login:");
        loginLabel.setBounds(150, loginHeight, 50, 20);

        JLabel passwordLabel = new JLabel();
        passwordLabel.setText("Hasło:");
        passwordLabel.setBounds(150, passHeight, 100, 20);

        final JTextField loginField = new JTextField();
        loginField.setBounds(200, loginHeight, 100, 20);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, passHeight, 100, 20);

        frame.add(mainLabel);
        frame.add(loginLabel);
        frame.add(loginField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmButton);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
