package pl.edu.wat.wcy.prz.projektv01.controller.DTO;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddPartDTO {

    @NotNull
    private String name;

    @NotNull
    private float value;

    @NotNull
    private int quantity;
}
