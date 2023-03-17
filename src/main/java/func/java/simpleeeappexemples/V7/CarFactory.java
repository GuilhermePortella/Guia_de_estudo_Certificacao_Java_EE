package func.java.simpleeeappexemples.V7;

import java.util.UUID;

/**
 *
 * @author Guilherme
 */
public class CarFactory {

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}
