package func.java.simpleeeappexemples.V6;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
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
    public Response createCar(Specification specification) {
        carManufacturer.manufactureCar(specification);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
