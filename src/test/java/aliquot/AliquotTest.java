package aliquot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AliquotTest {
    Aliquot aliquot;
    @BeforeEach
    public void setUp(){
        aliquot = new Aliquot(100.0);
    }

    @Test
    void shouldReturnInvalidFederationUnit(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            aliquot.setFederationUnit("AA");
        });
        assertEquals("Invalid federation unit!", exception.getMessage());
    }

    @Test
    void shouldReturnValidFederationUnit(){
        aliquot.setFederationUnit("AC");
        assertEquals("AC", aliquot.getFederationUnit());
    }

    @Test
    void shouldReturnInvalidProductValue(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            aliquot.setProductValue(0);
        });
        assertEquals("Invalid product value!", exception.getMessage());
    }

    @Test
    void shouldReturnValidProductValue(){
        aliquot.setProductValue(50);
        assertEquals(50, aliquot.getProductValue());
    }

    @Test
    void shouldReturnAliquotForAC(){
        aliquot.setFederationUnit("AC");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForAL(){
        aliquot.setFederationUnit("AL");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForAM(){
        aliquot.setFederationUnit("AM");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForAP(){
        aliquot.setFederationUnit("AP");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForBA(){
        aliquot.setFederationUnit("BA");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForCE(){
        aliquot.setFederationUnit("CE");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForDF(){
        aliquot.setFederationUnit("DF");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForES(){
        aliquot.setFederationUnit("ES");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForGO(){
        aliquot.setFederationUnit("GO");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForMA(){
        aliquot.setFederationUnit("MA");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForMT(){
        aliquot.setFederationUnit("MT");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForMS(){
        aliquot.setFederationUnit("MS");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForMG(){
        aliquot.setFederationUnit("MG");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForPA(){
        aliquot.setFederationUnit("PA");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForPB(){
        aliquot.setFederationUnit("PB");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForPR(){
        aliquot.setFederationUnit("PR");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForPE(){
        aliquot.setFederationUnit("PE");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForPI(){
        aliquot.setFederationUnit("PI");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForRN(){
        aliquot.setFederationUnit("RN");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForRS(){
        aliquot.setFederationUnit("RS");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForRJ(){
        aliquot.setFederationUnit("RJ");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForRO(){
        aliquot.setFederationUnit("RO");
        assertEquals(117.5, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForRR(){
        aliquot.setFederationUnit("RR");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForSC(){
        aliquot.setFederationUnit("SC");
        assertEquals(117.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForSP(){
        aliquot.setFederationUnit("SP");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForSE(){
        aliquot.setFederationUnit("SE");
        assertEquals(118.0, aliquot.calculateAliquot());
    }

    @Test
    void shouldReturnAliquotForTO(){
        aliquot.setFederationUnit("TO");
        assertEquals(118.0, aliquot.calculateAliquot());
    }
}