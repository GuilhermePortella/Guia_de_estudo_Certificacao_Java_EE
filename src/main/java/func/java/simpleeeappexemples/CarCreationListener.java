package func.java.simpleeeappexemples;

import javax.enterprise.event.Observes;

/**
 *
 * @author Guilherme
 */
public class CarCreationListener {

    public void onCarCreation(@Observes CarCreated carCreated) {
        // ...
        System.out.println("new car created with id " + carCreated.getIdentifier());
    }

}
