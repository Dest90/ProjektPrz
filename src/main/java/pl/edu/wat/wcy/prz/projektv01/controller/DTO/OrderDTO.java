package pl.edu.wat.wcy.prz.projektv01.controller.DTO;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    @NotNull
    private List<String> parts;

    @NotNull
    private Date date;

}
