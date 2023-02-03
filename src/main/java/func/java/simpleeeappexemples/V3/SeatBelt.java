package func.java.simpleeeappexemples.V3;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author Guilherme
 */
@Embeddable
public class SeatBelt {

    @Enumerated(EnumType.STRING)
    private SeatBeltModel model;

    public void close() {
    }

    public void open() {
    }
}
