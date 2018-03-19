package pl.edu.wat.wcy.prz.projektv01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wat.wcy.prz.projektv01.model.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

    UserEntity findByUsername(String username);

}
