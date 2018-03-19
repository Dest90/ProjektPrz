package pl.edu.wat.wcy.prz.projektv01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wat.wcy.prz.projektv01.model.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{

    PersonEntity findByEmail(String email);

}
