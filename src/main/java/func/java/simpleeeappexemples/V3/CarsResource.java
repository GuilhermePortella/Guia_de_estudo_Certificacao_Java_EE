package func.java.simpleeeappexemples.V3;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

/**
 *
 * @author Guilherme
 */
@Path("cars")
public class CarsResource {

    @Inject
    CarManufacturer carManufacturer;

    @GET
    public List<Car> getCars() {
        return carManufacturer.retrieveCars();
    }

    @POST
    public void createCar(Specification specification) {
        carManufacturer.manufactureCar(specification);
    }
}
