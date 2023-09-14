package aliquot;

public class Aliquot {
    private String federationUnit;
    private double productValue;

    public Aliquot(String federationUnit, double productValue){
        this.setFederationUnit(federationUnit);
        this.setProductValue(productValue);
    }

    public String getFederationUnit() {
        return this.federationUnit;
    }

    public void setFederationUnit(String federationUnit) {
        this.federationUnit = federationUnit;
    }

    public double getProductValue() {
        return this.productValue;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }
}