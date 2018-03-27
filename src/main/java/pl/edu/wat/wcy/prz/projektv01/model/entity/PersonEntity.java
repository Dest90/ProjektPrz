package pl.edu.wat.wcy.prz.projektv01.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.edu.wat.wcy.prz.projektv01.model.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "PERSON")
@EqualsAndHashCode(callSuper = true)
public class PersonEntity extends BaseEntity{

    @Column
    private String email;

    @Column
    private String password;

    @Column
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ID")
    private List<OrderEntity> orders;

}
