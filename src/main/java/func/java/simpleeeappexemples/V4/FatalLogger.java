package func.java.simpleeeappexemples.V4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme
 */
public class FatalLogger {

    private static final Logger LOGGER = Logger.getLogger(FatalLogger.class.getName());

    public void fatal(Throwable throwable) {
        LOGGER.log(Level.SEVERE, throwable.getMessage(), throwable);
    }

}
