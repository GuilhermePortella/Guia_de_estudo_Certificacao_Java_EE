package func.java.simpleeeappexemples.V5;

import javax.enterprise.event.ObservesAsync;
import java.util.concurrent.locks.LockSupport;

/**
 *
 * @author Guilherme
 */
public class CarCreationListener {

    public void onCarCreation(@ObservesAsync CarCreated carCreated) {
        LockSupport.parkNanos(2_000_000_000L);
        System.out.println("new car created with id " + carCreated.getIdentifier());
    }
}
