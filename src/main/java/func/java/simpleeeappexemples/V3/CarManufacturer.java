package func.java.simpleeeappexemples.V3;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author Guilherme
 */
@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;

    @PersistenceContext
    EntityManager entityManager;

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        entityManager.persist(car);
        return car;
    }

    public List<Car> retrieveCars() {
        return entityManager.createNamedQuery(Car.FIND_ALL, Car.class).getResultList();
    }
}
