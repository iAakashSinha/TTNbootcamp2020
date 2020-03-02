//Ques2.2: Write Unit tests for HealthyCoder app given in the Udemy session. You need to write tests for the BMICalculator and DitePlanner.


package healthycoderapp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

class DietPlannerTest {

    private DietPlanner dietPlanner;

    @BeforeEach
    void setup(){
        this.dietPlanner = new DietPlanner(20,30,50);
    }

    @Test
    void should_returnCorrect_DietPlan_When_CorrectCoder(){
        //given
        Coder coder = new Coder(1.82,75.0,26,Gender.MALE);
        DietPlan expected = new DietPlan(2202,110,73,275);


        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                () -> assertEquals(expected.getCalories(),actual.getCalories()),
                () -> assertEquals(expected.getProtein(),actual.getProtein()),
                () -> assertEquals(expected.getCarbohydrate(),actual.getCarbohydrate()),
                () -> assertEquals(expected.getFat(),actual.getFat())
        );
    }
}