package pl.edu.wat.wcy.prz.projektv01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.AddPartDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.PartEntity;
import pl.edu.wat.wcy.prz.projektv01.service.PartService;

import java.util.List;

@RestController
@RequestMapping("/part")
public class PartController {

    @Autowired
    PartService partService;

    @PostMapping("/new")
    PartEntity newPart(@RequestBody @Validated AddPartDTO dto){
        return partService.newPart(dto);
    }

    @PostMapping("/add")
    PartEntity addPart(@RequestBody @Validated AddPartDTO dto){
        return partService.addPart(dto);
    }

    @PostMapping("/remove")
    PartEntity removePart(@RequestBody @Validated AddPartDTO dto){
        return partService.removePart(dto);
    }

    @GetMapping("/show")
    PartEntity showPart(AddPartDTO dto){
        return partService.showPart(dto);
    }

    @GetMapping("/list")
    List<PartEntity> listAllParts(){
        return partService.listAllParts();
    }

}
