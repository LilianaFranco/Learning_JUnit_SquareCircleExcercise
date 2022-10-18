import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNull;

public class SquareTest {

    @Test
    public void getAreaFigure_SquareSideZero(){
        //Given
        Square SquareNoSide = new Square(0.0);

        //When
        Double answerSquareNoSide = SquareNoSide.getAreaFigure();

        //Then
        assertNull(answerSquareNoSide);

    }

    @Test
    public void getAreaFigure_SquareValidRadius(){
        //Given
        Square squareValidSide = new Square(2.2);

        //When
        Double answerValidSide = squareValidSide.getAreaFigure();

        //Then
        assertNotNull(answerValidSide);

    }
}
