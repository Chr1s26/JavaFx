import java.util.Date;

public class MidtermOOP {
    private double number;
    private double number1;

    public  MidtermOOP(){

    }
    public MidtermOOP(double number, double number1) {
        this.number= number;
        this.number1 = number1;
    }
    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double addition(){
        return number + number1;
    }

    public double subtract(){
        return  number - number1;
    }

    public double multiply(){
        return number * number1;
    }

    public double divide(){
        return number/number1;
    }
}

