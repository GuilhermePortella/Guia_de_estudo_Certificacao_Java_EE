package func.java.simpleeeappexemples.V2;

import javax.ejb.ApplicationException;

/**
 *
 * @author Guilherme
 */
@ApplicationException
public class CarCreationException extends RuntimeException {

    public CarCreationException(String message) {
        super(message);
    }
}
