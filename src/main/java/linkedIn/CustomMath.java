package linkedIn;

public class CustomMath {
    private double value;

    public CustomMath() {
        this.value = 0;
    }

    public CustomMath(double initialValue) {
        this.value = initialValue;
    }

    public CustomMath add(double... args) {
        for (double num : args) {
            this.value += num;
        }
        return this;
    }

    public CustomMath subtract(double amount) {
        this.value -= amount;
        return this;
    }

    public CustomMath multiply(double factor) {
        this.value *= factor;
        return this;
    }

    public double getResult() {
        return this.value;
    }

    public static void main(String[] args) {
        CustomMath customMath = new CustomMath();
        double result = customMath
                .add(1, 2)       
                .multiply(5)     
                .subtract(24)  
                .add(3, 4, 5, 6)
                .getResult();

        System.out.println(result); 
        }
}
