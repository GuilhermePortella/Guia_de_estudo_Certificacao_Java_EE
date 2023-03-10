package func.java.simpleeeappexemples.V2;

import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Guilherme
 */
public class CarFactory {

    public Car createCar(Specification specification) {
        if (new Random().nextBoolean()) {
            throw new CarCreationException("could not create car");
        }
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }

}
