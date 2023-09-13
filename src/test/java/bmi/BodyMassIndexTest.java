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
        try{
            bodyMassIndex.setWeight(0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Invalid weight!", e.getMessage());
        }
    }

    @Test
    void shouldReturnInvalidHeight(){
        try{
            bodyMassIndex.setHeight(0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Invalid height!", e.getMessage());
        }
    }

    @Test
    void shouldReturnInvalidSex(){
        try{
            bodyMassIndex.setSex('A');
        }
        catch (IllegalArgumentException e){
            assertEquals("Invalid sex! Please type M for male and F for female", e.getMessage());
        }
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