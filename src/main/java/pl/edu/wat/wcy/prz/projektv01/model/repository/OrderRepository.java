package pl.edu.wat.wcy.prz.projektv01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wat.wcy.prz.projektv01.model.entity.OrderEntity;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

    List<OrderEntity> findAllByDate(Date date);

}
