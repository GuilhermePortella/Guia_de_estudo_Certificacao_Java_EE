package Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Guilherme
 */

@Path("/hello")
public class Test {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(){
        return "Hello World!";
    }
    
}
