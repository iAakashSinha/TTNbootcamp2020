//Ques 2.1: Write Unit tests for HealthyCoder app given in the Udemy session. You need to write tests for the BMICalculator and DitePlanner.


package healthycoderapp;

import com.im.First;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Nested
    class isDietRecommendedTest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_ReturnTrue_When_DietRecommended() {
            //given
            double weight = 80;
            double height = 1.5;
            //when

            boolean recommended = BMICalculator.isDietRecommended(weight, height);
            //then

            assertTrue(recommended);
        }

        @Test
        void should_ReturnFalse_When_DietNotRecommended() {
            //given
            double weight = 40;
            double height = 1.95;
            //when

            boolean recommended = BMICalculator.isDietRecommended(weight, height);
            //then

            assertFalse(recommended);
        }

        @Test
        void should_Throw_ArithmeticException_When_HeightIsZero() {
            //given
            double weight = 40;
            double height = 0.0;

            //when
            Executable exe = () -> BMICalculator.isDietRecommended(weight, height);

            //then
            assertThrows(ArithmeticException.class,exe);
        }
    }

    @Nested
    class findCoderWithWorstBMITest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty()
        {
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80,60.0));
            coders.add(new Coder(1.82,65.2));
            coders.add(new Coder(1.82,98.0));

            //when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            //then
            assertAll(
                    () -> assertEquals(1.82,coderWorstBMI.getHeight()),
                    () -> assertEquals(98.0,coderWorstBMI.getWeight())
            );
        }

        @Test
        void should_ReturnNullWorstBMICoder_When_CoderListEmpty()
        {
            //given
            List<Coder> coders = new ArrayList<>();

            //when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            //then
            assertNull(coderWorstBMI);
        }
    }

    @Nested
    class getBMIScoresTest {
        First obj;

        @BeforeEach
        void initialize() {
            obj = new First();
        }

        @Test
        void should_returnCorrectBMIScoreArray_When_CoderListNotEmpty()
        {
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80,60.0));
            coders.add(new Coder(1.82,98.0));
            coders.add(new Coder(1.82,64.7));
            double[] expected = {18.52,29.59,19.53};

            //when
            double[] bmiscores = BMICalculator.getBMIScores(coders);

            //then
            assertArrayEquals(expected,bmiscores);
        }
    }
}