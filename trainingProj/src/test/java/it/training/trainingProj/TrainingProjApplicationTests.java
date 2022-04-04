package it.training.trainingProj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.training.datalayer.TestTrainingManager;

@SpringBootTest
class TrainingProjApplicationTests {

    @Autowired
    TestTrainingManager testTrainingManager;

    @Test
    void testSubstraction() {

	double sub = testTrainingManager.substraction(10.0, 5.0);

	assertEquals(5.0, sub, 0.000001);

	sub = testTrainingManager.substraction(3.0, 5.0);

	assertEquals(-2.0, sub, 0.000001);

	sub = testTrainingManager.substraction(11.3, 5.2);

	assertEquals(6.1, sub, 0.000001);

    }

    @Test
    void testSum() {

	double sum = testTrainingManager.sum(23.0, 27.0);

	assertEquals(50.0, sum);

	sum = testTrainingManager.sum(2.0, 7.0);

	assertEquals(9.0, sum);

	sum = testTrainingManager.sum(5.0, 5.0);

	assertNotEquals(9.0, sum);

    }

}
