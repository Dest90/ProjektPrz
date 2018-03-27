package pl.edu.wat.wcy.prz.projektv01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wat.wcy.prz.projektv01.controller.DTO.AddPartDTO;
import pl.edu.wat.wcy.prz.projektv01.model.entity.PartEntity;
import pl.edu.wat.wcy.prz.projektv01.model.repository.PartRepository;

import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartRepository partRepository;

    public PartEntity newPart(AddPartDTO partDTO){

        String name = partDTO.getName();
        float value = partDTO.getValue();
        int quantity = partDTO.getQuantity();

        if (partRepository.findByName(name) != null){
            throw new IllegalArgumentException("This part already exists in base!");
        }

        PartEntity partEntity = new PartEntity();

        partEntity.setName(name);
        partEntity.setValue(value);
        partEntity.setQuantity(quantity);

        return partRepository.save(partEntity);
    }

    public PartEntity addPart(AddPartDTO partDTO){

        PartEntity partEntity = partRepository.findByName(partDTO.getName());
        int quantity = partDTO.getQuantity();
        if (partEntity == null){
            throw new IllegalArgumentException("Part doesn't exist!");
        }
        partEntity.setQuantity(partDTO.getQuantity()+quantity);

        return partRepository.save(partEntity);

    }

    public PartEntity removePart(AddPartDTO partDTO){

        PartEntity partEntity = partRepository.findByName(partDTO.getName());
        int quantity = partDTO.getQuantity();
        if (partEntity == null){
            throw new IllegalArgumentException("Part doesn't exist!");
        }
        if (partEntity.getQuantity() < quantity){
            throw new IllegalArgumentException("There's not enough "+partEntity.getName()+" in store");
        }
        partEntity.setQuantity(partDTO.getQuantity()-quantity);

        return partRepository.save(partEntity);
    }

    public PartEntity showPart(AddPartDTO partDTO){
        return partRepository.findByName(partDTO.getName());
    }

    public List<PartEntity> listAllParts() { return partRepository.findAll(); }

}
