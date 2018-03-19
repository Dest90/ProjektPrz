package pl.edu.wat.wcy.prz.projektv01.controller.DTO;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserDTO {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String role;

}
