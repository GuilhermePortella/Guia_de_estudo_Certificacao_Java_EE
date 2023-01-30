package func.java.simpleeeappexemples;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.UUID;
/**
 *
 * @author Guilherme
 */
@Dependent
public class CarFactory {
    
    @Inject
    @Diesel
    Color defaultCarColor;
    
    public Car createCar(Specification specification){
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor() == null ? defaultCarColor : specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}
