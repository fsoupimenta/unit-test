package bmi;
public class BodyMassIndex {
    private double weight;
    private double height;
    private char sex;

    public BodyMassIndex(double weight, double height, char sex){
        this.setWeight(weight);
        this.setHeight(height);
        this.setSex(sex);
    }

    public String getBodyMassIndex(){
        double bodyMassIndexValue = calculateBodyMassIndex();
        String bodyMassIndexResult;

        if (this.sex == 'F'){
            if (bodyMassIndexValue < 19.1){
                bodyMassIndexResult = "Under weight";
            }
            else if (bodyMassIndexValue < 25.8){
                bodyMassIndexResult = "Normal weight";
            }
            else if (bodyMassIndexValue < 27.3){
                bodyMassIndexResult = "Marginally overweight";
            }
            else if (bodyMassIndexValue < 32.3){
                bodyMassIndexResult = "Over ideal weight";
            }
            else {
                bodyMassIndexResult = "Obese";
            }
        }
        else{
            if (bodyMassIndexValue < 20.7){
                bodyMassIndexResult = "Under weight";
            }
            else if (bodyMassIndexValue < 26.4){
                bodyMassIndexResult = "Normal weight";
            }
            else if (bodyMassIndexValue < 27.8){
                bodyMassIndexResult = "Marginally overweight";
            }
            else if (bodyMassIndexValue < 31.1){
                bodyMassIndexResult = "Over ideal weight";
            }
            else {
                bodyMassIndexResult = "Obese";
            }
        }
        return bodyMassIndexResult;
    }

    public double calculateBodyMassIndex(){
        return this.getWeight() / (this.getHeight() * this.getHeight());
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        if (weight < 0){
            throw new IllegalArgumentException("Invalid weight!");
        }
        this.weight = weight;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        if (height < 0){
            throw new IllegalArgumentException("Invalid height!");
        }
        this.height = height;
    }

    public char getSex(){
        return this.sex;
    }

    public void setSex(char sex){
        sex = Character.toUpperCase(sex);
        if (sex != 'M' && sex != 'F'){
            throw new IllegalArgumentException("Invalid sex! Please type M for male and F for female");
        }
        this.sex = sex;
    }
}