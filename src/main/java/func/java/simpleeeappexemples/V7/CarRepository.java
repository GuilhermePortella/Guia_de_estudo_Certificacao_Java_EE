package func.java.simpleeeappexemples.V7;

import java.util.List;

import static java.util.Arrays.asList;

/**
 *
 * @author Guilherme
 */
public class CarRepository {

    public void store(Car car) {
        // ...
    }

    public List<Car> loadCars() {
        // dummy creation
        return asList(
                createCar("X123A234", Color.RED, EngineType.DIESEL),
                createCar("X234B345", Color.BLACK, EngineType.ELECTRIC),
                createCar("X345C456", Color.GREY, EngineType.PETROL)
        );
    }

    private static Car createCar(String identifier, Color color, EngineType engineType) {
        Car car = new Car();
        car.setIdentifier(identifier);
        car.setColor(color);
        car.setEngineType(engineType);
        return car;
    }
}
