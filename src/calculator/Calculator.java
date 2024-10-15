package calculator;

public class Calculator {
    protected float latestValue;

    public Calculator(){
        System.out.println("Welcome.");
        latestValue = 0;
    }

    public float getLatestValue() {
        return latestValue;
    }

    public void setLatestValue(float latestValue) {
        this.latestValue = latestValue;
    }

    
    public void add(float num1, float num2){
        float res = num1 + num2;
        this.latestValue = res;
        System.out.println(res);       
    }

    public void sub(float num1, float num2){
        float res = num1 - num2;
        this.latestValue = res;
        System.out.println(res);           
    }

    public void divide(float num1, float num2){
        float res = num1 / num2;
        this.latestValue = res;
        System.out.println(res);           
    }

    public void mul(float num1, float num2){
        float res = num1 * num2;
        this.latestValue = res;
        System.out.println(res);           
    }

    public void exit(){
        System.out.println("Bye Bye");
        System.exit(0);
    }


    
}
