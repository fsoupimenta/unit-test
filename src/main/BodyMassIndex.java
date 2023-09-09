public class BodyMassIndex {
    private double weight;
    private double height;
    private char sex;

    public BodyMassIndex(double weight, double height, char sex){
        this.setWeight(weight);
        this.setHeight(height);
        this.setSex(sex);
    }

    public String calculateBmi(){
        double bmiValue = this.getWeight() / (this.getHeight() * this.getHeight());
        String bmiReturn;

        if (this.sex == 'F'){
            if (bmiValue < 19.1){
                bmiReturn = "Under weight";
            }
            else if (bmiValue < 25.8){
                bmiReturn = "Normal weight";
            }
            else if (bmiValue < 27.3){
                bmiReturn = "Marginally overweight";
            }
            else if (bmiValue < 32.3){
                bmiReturn = "Over ideal weight";
            }
            else {
                bmiReturn = "Obese";
            }
        }
        else{
            if (bmiValue < 20.7){
                bmiReturn = "Under weight";
            }
            else if (bmiValue < 26.4){
                bmiReturn = "Normal weight";
            }
            else if (bmiValue < 27.8){
                bmiReturn = "Marginally overweight";
            }
            else if (bmiValue < 31.1){
                bmiReturn = "Over ideal weight";
            }
            else {
                bmiReturn = "Obese";
            }
        }
        return bmiReturn;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        if (weight < 0){
            throw new IllegalArgumentException("Weight invalid!");
        }
        this.weight = weight;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        if (height < 0){
            throw new IllegalArgumentException("Height invalid!");
        }
        this.height = height;
    }

    public char getSex(){
        return this.sex;
    }

    public void setSex(char sex){
        sex = Character.toUpperCase(sex);
        if (sex != 'M' && sex != 'F'){
            throw new IllegalArgumentException("Sex not valid! Please type M for male and F for female");
        }
        this.sex = sex;
    }
}