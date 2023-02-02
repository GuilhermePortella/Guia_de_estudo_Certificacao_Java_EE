package func.java.simpleeeappexemples.V2;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Guilherme
 */
public class EnvironmentalFriendlyValidator implements ConstraintValidator<EnvironmentalFriendly, EngineType> {

    public void initialize(EnvironmentalFriendly constraint) {
    }

    public boolean isValid(EngineType engineType, ConstraintValidatorContext context) {
        return engineType == EngineType.ELECTRIC;
    }

}
