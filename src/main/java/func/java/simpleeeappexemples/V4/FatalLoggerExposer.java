package func.java.simpleeeappexemples.V4;

import javax.enterprise.inject.Produces;
import java.util.function.Consumer;

/**
 *
 * @author Guilherme
 */
public class FatalLoggerExposer {

    @Produces
    public Consumer<Throwable> exposeFatalLogger() {
        return Throwable::printStackTrace;
    }

}
