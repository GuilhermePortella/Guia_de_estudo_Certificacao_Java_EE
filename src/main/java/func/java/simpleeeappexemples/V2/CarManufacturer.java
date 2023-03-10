package func.java.simpleeeappexemples.V2;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Guilherme
 */
@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;

    @Inject
    CarRepository carRepository;

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carRepository.store(car);
        return car;
    }

    public List<Car> retrieveCars() {
        return carRepository.loadCars();
    }

    public List<Car> retrieveCars(EngineType filter) {
        return carRepository.loadCars().stream()
                .filter(c -> c.getEngineType() == filter)
                .collect(Collectors.toList());
    }

    public Car retrieveCar(String identifier) {
        Car car = new Car();
        car.setIdentifier(identifier);
        return car;
    }

}
