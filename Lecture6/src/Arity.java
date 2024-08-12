

public class Arity {
    public static void main(String[] args) {
        System.out.println(average(1.5,2.4,3.1415,5,1.3));
        double a[] = {1.5,2.4,3.1415,5,1.3};
        System.out.println("");
        System.out.println(averageArray(a));
    }
    public static double average(double... numbers){
        double sum;
        double average;
        sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        average = sum/numbers.length;

        return average;
    }

    public static double averageArray (double array[]){
        double sum;
        double average;
        sum = 0;

        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        average = sum/array.length;

        return average;
    }
}
