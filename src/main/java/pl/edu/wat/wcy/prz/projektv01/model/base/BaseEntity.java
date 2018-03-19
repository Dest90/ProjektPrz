package pl.edu.wat.wcy.prz.projektv01.model.base;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@MappedSuperclass
@ToString(of = "id", includeFieldNames = false)
public class BaseEntity {

    @Id
    @SequenceGenerator(name = "sq_base_id", sequenceName = "SQL_ID_BASEENTITY_INC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_base_id")
    protected int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BaseEntity that = (BaseEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {

        return id;
    }
}
