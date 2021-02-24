package com.example.demo.carDao;

import com.example.demo.carEntity.CarEntity;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CarDaoImpl implements ICarDao {

    private EntityManager entityManager;

    @Autowired
    public CarDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public String saveCar(List<CarEntity> cars) {

        Session session = entityManager.unwrap(Session.class);

        try {
            for(CarEntity carEntity : cars) {
                session.save(carEntity);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "cars saved";
    }
}
