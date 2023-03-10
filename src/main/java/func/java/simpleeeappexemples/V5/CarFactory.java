package func.java.simpleeeappexemples.V5;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Guilherme
 */
public class CarFactory {

    @Resource
    ManagedScheduledExecutorService mses;

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }

    public void activateTimer() {
        mses.scheduleAtFixedRate(this::doSomething, 60, 10, TimeUnit.SECONDS);
    }

    public void doSomething() {
        System.out.println("print something");
    }
}
