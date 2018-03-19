package pl.edu.wat.wcy.prz.projektv01.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.edu.wat.wcy.prz.projektv01.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "USER")
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity{

    private String username;

    private String password;

    private String role;

}
