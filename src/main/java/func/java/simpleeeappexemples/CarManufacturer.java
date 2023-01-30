package func.java.simpleeeappexemples;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

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
    Event<CarCreated> carcreated;
    
    public Car manufactureCar(Specification specification){
        Car car = carFactory.createCar(specification);
        carRepository.store(car);
        carcreated.fire(new CarCreated(car.getIdentifier()));
        return car;
    }
    
}
