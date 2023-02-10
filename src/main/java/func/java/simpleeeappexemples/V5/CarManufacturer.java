package func.java.simpleeeappexemples.V5;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.List;

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

    @Inject
    CarProcessor carProcessor;

    @Inject
    Event<CarCreated> carCreated;

    @Resource
    ManagedExecutorService mes;

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carRepository.store(car);
        carProcessor.processNewCarAsync(car);
        mes.execute(() -> carProcessor.processNewCar(car));
        carCreated.fireAsync(new CarCreated(car.getIdentifier()));
        return car;
    }

    public List<Car> retrieveCars() {
        return carRepository.loadCars();
    }
}
