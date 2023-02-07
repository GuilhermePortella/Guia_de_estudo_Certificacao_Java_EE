package func.java.simpleeeappexemples.V4;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Guilherme
 */
@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;

    @Inject
    CarCache carCache;

    @Inject
    Consumer<Throwable> fatalLogger;

    @Tracked(ProcessTracker.Category.MANUFACTURER)
    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carCache.cache(car);

        try {
            // do something that can fail
        } catch (Exception e) {
            fatalLogger.accept(e);
        }

        return car;
    }

    public List<Car> retrieveCars() {
        return carCache.retrieveCars();
    }
}
