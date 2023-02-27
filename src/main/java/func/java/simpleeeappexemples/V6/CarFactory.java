package func.java.simpleeeappexemples.V6;

import javax.inject.Inject;

/**
 *
 * @author Guilherme
 */
public class CarFactory {

    @Inject
    IdentifierAccessor identifierAccessor;

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(identifierAccessor.retrieveCarIdentification(specification));
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }

}
