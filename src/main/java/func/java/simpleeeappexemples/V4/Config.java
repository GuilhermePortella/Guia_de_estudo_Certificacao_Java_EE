package func.java.simpleeeappexemples.V4;

import javax.enterprise.util.Nonbinding;
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
public @interface Config {

    @Nonbinding
    String value();

}
