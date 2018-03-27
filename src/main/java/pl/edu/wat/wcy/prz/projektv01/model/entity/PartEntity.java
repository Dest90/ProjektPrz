package pl.edu.wat.wcy.prz.projektv01.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.edu.wat.wcy.prz.projektv01.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PART")
@EqualsAndHashCode(callSuper = true)
public class PartEntity extends BaseEntity{

    @Column
    private String name;

    @Column
    private double value;

    @Column
    private int quantity;
}
