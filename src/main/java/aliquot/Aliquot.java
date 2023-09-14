package aliquot;

import java.util.Arrays;
import java.util.List;

public class Aliquot {
    private String federationUnit;
    private double productValue;
    private static final List<String> listFederationUnits = Arrays.asList(
            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI",
            "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"
    );

    public Aliquot(String federationUnit, double productValue){
        this.setFederationUnit(federationUnit);
        this.setProductValue(productValue);
    }

    public String getFederationUnit() {
        return this.federationUnit;
    }

    public void setFederationUnit(String federationUnit) {
        if (!listFederationUnits.contains(federationUnit)){
            throw new IllegalArgumentException("Invalid federation unit!");
        }
        this.federationUnit = federationUnit;
    }

    public double getProductValue() {
        return this.productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }
}