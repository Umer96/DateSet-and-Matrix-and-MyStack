package sjsu.edu;

import java.util.Scanner;

public class DataSet {
    double [] data;
    int dataSize;

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of values you want to calculate: ");
        int numbers = in.nextInt();

        if (numbers >=0 && numbers <= 100){
            System.out.println("Enter the numbers: ");
            DataSet arrayValues = new DataSet(100);
            for(int i = 0; i < numbers; i++){
                double values = in.nextDouble();
                arrayValues.add(values);
            }

            System.out.println("Sum is: " + arrayValues.getSum());
            System.out.println("Average value is: " + arrayValues.getAverage());
            System.out.println("Maximum value is: " + arrayValues.getMaximum());
            System.out.println("Minimum value is: " + arrayValues.getMinimum());
        }
        else{
            System.out.println("You cannot enter more than 100 numbers.");
        }
    }

    public DataSet(int maximumNumberOfValues) {
        dataSize = 0;
        data = new double[maximumNumberOfValues];
    }

    public void add(double value){
        if(dataSize <= data.length){
            data [dataSize++] = value;
        }
    }

    public double getSum(){
        double sum = 0;
        for (int i = 0; i <= dataSize; i++){
            sum += data[i];
        }
        return sum;
    }

    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < dataSize; i++){
            sum += data[i];
        }
        return sum/dataSize;
    }

    public double getMaximum(){
        double maximum = Double.MIN_VALUE;
        for (int i = 0; i < dataSize; i++){
            maximum = Math.max(maximum, data[i]);
        }
        return maximum;
    }

    public double getMinimum(){
        double minimum = Double.MAX_VALUE;
        for (int i = 0; i < dataSize; i++){
            minimum = Math.min(minimum, data[i]);
        }
        return minimum;
    }
}
