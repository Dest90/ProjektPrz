package pl.edu.wat.wcy.prz.projektv01.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.edu.wat.wcy.prz.projektv01.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PART")
@EqualsAndHashCode(callSuper = true)
public class PartEntity extends BaseEntity{

    private String name;

    private float value;

    private int quantity;
}
