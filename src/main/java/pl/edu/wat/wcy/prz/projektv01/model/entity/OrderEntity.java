package pl.edu.wat.wcy.prz.projektv01.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.edu.wat.wcy.prz.projektv01.model.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "ORDER")
@EqualsAndHashCode(callSuper = true)
public class OrderEntity extends BaseEntity{

    @Column
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id")
    private List<PartEntity> parts;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

}
