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
    public void shouldReturnFemaleUnderWeight(){
        assertEquals("Under weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnFemaleNormalWeight(){
        bodyMassIndex.setWeight(25.7);
        assertEquals("Normal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnFemaleMarginallyOverweight(){
        bodyMassIndex.setWeight(27.2);
        assertEquals("Marginally overweight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnFemaleOverIdealWeight(){
        bodyMassIndex.setWeight(32.2);
        assertEquals("Over ideal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnFemaleObese(){
        bodyMassIndex.setWeight(32.3);
        assertEquals("Obese", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnMaleUnderWeight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(20.6);
        assertEquals("Under weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnMaleNormalWeight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(26.3);
        assertEquals("Normal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnMaleMarginallyOverweight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(27.7);
        assertEquals("Marginally overweight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnMaleOverIdealWeight(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(31.0);
        assertEquals("Over ideal weight", bodyMassIndex.getBodyMassIndex());
    }

    @Test
    public void shouldReturnMaleObese(){
        bodyMassIndex.setSex('M');
        bodyMassIndex.setWeight(31.1);
        assertEquals("Obese", bodyMassIndex.getBodyMassIndex());
    }
}