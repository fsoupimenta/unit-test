package bmi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {
    BodyMassIndex bodyMassIndex;
    @BeforeEach
    public void init(){
        bodyMassIndex = new BodyMassIndex(19, 1, 'F');
    }

    @Test
    void shouldReturnInvalidWeight(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bodyMassIndex.setWeight(0);
        });
        assertEquals("Invalid weight!", exception.getMessage());
    }

    @Test
    void shouldReturnInvalidHeight(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bodyMassIndex.setHeight(0);
        });
        assertEquals("Invalid height!", exception.getMessage());
    }

    @Test
    void shouldReturnInvalidSex(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            bodyMassIndex.setSex('A');
        });
        assertEquals("Invalid sex! Please type M for male and F for female", exception.getMessage());
    }

    @Test
    void shouldReturnFemaleUnderWeight(){
        assertEquals("Under weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnFemaleNormalWeight(){
        bodyMassIndex.setWeight(25.7);
        assertEquals("Normal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnFemaleMarginallyOverweight(){
        bodyMassIndex.setWeight(27.2);
        assertEquals("Marginally overweight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnFemaleOverIdealWeight(){
        bodyMassIndex.setWeight(32.2);
        assertEquals("Over ideal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnFemaleObese(){
        bodyMassIndex.setWeight(32.3);
        assertEquals("Obese", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnMaleUnderWeight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(20.6);
        assertEquals("Under weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnMaleNormalWeight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(26.3);
        assertEquals("Normal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnMaleMarginallyOverweight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(27.7);
        assertEquals("Marginally overweight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnMaleOverIdealWeight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(31.0);
        assertEquals("Over ideal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    void shouldReturnMaleObese(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(31.1);
        assertEquals("Obese", bodyMassIndex.getBodyMassIndex());
    }
}