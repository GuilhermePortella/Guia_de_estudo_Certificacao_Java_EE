package func.java.simpleeeappexemples;

import javax.enterprise.inject.Produces;
/**
 *
 * @author Guilherme
 */
public class DefaultColorExposer {
    
    @Produces
    @Diesel
    public Color exposeDefaultColor(){
        return Color.RED;
    }
    
}
