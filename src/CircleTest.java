import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNull;

public class CircleTest {

    @Test
    public void getAreaFigure_CircleRadiusZero(){
        //Given
        Circle circleNoRadius = new Circle(0.0);

        //When
        Double answerRadiusZero = circleNoRadius.getAreaFigure();

        //Then
        assertNull(answerRadiusZero);

    }

    @Test
    public void getAreaFigure_CircleValidRadius(){
        //Given
        Circle circleValidRadius = new Circle(2.2);

        //When
        Double answerValidRadius = circleValidRadius.getAreaFigure();

        //Then
        assertNotNull(answerValidRadius);

    }

}
