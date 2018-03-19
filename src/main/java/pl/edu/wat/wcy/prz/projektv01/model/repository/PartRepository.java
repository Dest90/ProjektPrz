package pl.edu.wat.wcy.prz.projektv01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wat.wcy.prz.projektv01.model.entity.PartEntity;

@Repository
public interface PartRepository extends JpaRepository<PartEntity, Integer>{

    PartEntity findByName(String name);

}
