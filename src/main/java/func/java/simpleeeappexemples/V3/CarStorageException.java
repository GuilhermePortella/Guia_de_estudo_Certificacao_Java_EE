package func.java.simpleeeappexemples.V3;

import javax.ejb.ApplicationException;

/**
 *
 * @author Guilherme
 */
@ApplicationException(rollback = true)
public class CarStorageException extends Exception {

    public CarStorageException(String message) {
        super(message);
    }

}
