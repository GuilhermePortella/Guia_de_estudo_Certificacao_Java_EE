package func.java.simpleeeappexemples.V5;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import java.util.concurrent.locks.LockSupport;

/**
 *
 * @author Guilherme
 */
@Stateless
public class CarProcessor {

    @Asynchronous
    public void processNewCarAsync(Car car) {
        LockSupport.parkNanos(2_000_000_000L);
        String result = "processed: " + car;
        System.out.println(result);
    }

    public void processNewCar(Car car) {
        LockSupport.parkNanos(2_000_000_000L);
        String result = "processed: " + car;
        System.out.println(result);
    }
}
