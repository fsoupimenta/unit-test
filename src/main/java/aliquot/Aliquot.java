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

    public Aliquot(double productValue){
        this.setProductValue(productValue);
    }

    public double calculateAliquot(){
        double productValueWithAliquot;
        if ("AC".equals(this.getFederationUnit()) || "AL".equals(this.getFederationUnit()) ||
                "ES".equals(this.getFederationUnit()) || "GO".equals(this.getFederationUnit()) ||
                "MT".equals(this.getFederationUnit()) || "MS".equals(this.getFederationUnit()) ||
                "PA".equals(this.getFederationUnit()) || "RR".equals(this.getFederationUnit()) ||
                "SC".equals(this.getFederationUnit())) {
            productValueWithAliquot = this.getProductValue() + (this.getProductValue() * 0.17);
        }
        else if ("AM".equals(this.getFederationUnit()) || "AP".equals(this.getFederationUnit()) ||
                "BA".equals(this.getFederationUnit()) || "CE".equals(this.getFederationUnit()) ||
                "DF".equals(this.getFederationUnit()) || "MA".equals(this.getFederationUnit()) ||
                "MG".equals(this.getFederationUnit()) || "PB".equals(this.getFederationUnit()) ||
                "PR".equals(this.getFederationUnit()) || "PE".equals(this.getFederationUnit()) ||
                "PI".equals(this.getFederationUnit()) || "RN".equals(this.getFederationUnit()) ||
                "RS".equals(this.getFederationUnit()) || "RJ".equals(this.getFederationUnit()) ||
                "SP".equals(this.getFederationUnit()) || "SE".equals(this.getFederationUnit()) ||
                "TO".equals(this.getFederationUnit())){
            productValueWithAliquot = this.getProductValue() + (this.getProductValue() * 0.18);
        }
        else {
            productValueWithAliquot = this.getProductValue() + (this.getProductValue() * 0.175);
        }
        return productValueWithAliquot;
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
        if (productValue <= 0){
            throw new IllegalArgumentException("Invalid product value!");
        }
        this.productValue = productValue;
    }
}