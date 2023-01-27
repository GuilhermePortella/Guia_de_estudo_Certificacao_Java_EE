package func.java.simpleeeappexemples;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 *
 * @author Guilherme
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Diesel {
}
