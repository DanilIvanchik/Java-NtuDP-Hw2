import java.util.Random;
import java.util.Scanner;

public class Array {

    static Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int[][] myArray;
    int sizeWidth;
    int sizeHeight;

    Array(int sizeWidth,int sizeHeight){
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
        this.myArray = new int[sizeWidth][sizeHeight];
    }

    void findMin(){
        int minElement = 2147483647;
        for (int[] ints : myArray) {
            for (int anInt : ints) {
                if (anInt < minElement) {
                    minElement = anInt;
                }
            }
        }
        System.out.println("Minimum element: "+minElement);
    }

    void findMax(){
        int maxElement = 0;
        for (int[] ints : myArray) {
            for (int anInt : ints) {
                if (anInt > maxElement) {
                    maxElement = anInt;
                }
            }
        }
        System.out.println("Maximum element: "+maxElement);
    }

    void showMyArray(){
        System.out.println("Here is your array:");
        for (int[] ints : myArray) {
            for (int j = 0; (ints != null && j < ints.length); j++) {
                System.out.print(ints[j] + " ");
            }

            System.out.println();
        }
    }

    void findAverage(){
        int arraySum = 0;
        for (int[] ints : myArray) {
            for (int anInt : ints) {
                arraySum += anInt;
            }
        }
        double arrayAverage = (double) arraySum /((double) sizeWidth * (double) sizeHeight);
        System.out.println("Average: "+arrayAverage);
    }

    void findAverageGeometric(){
        int arrayMultiply = 1;
        for (int[] ints : myArray) {
            for (int anInt : ints) {
                arrayMultiply *= anInt;
            }
        }

        double degree = 1/((double) sizeWidth * (double) sizeHeight);
        double arrayAverageGeometric = Math.pow(arrayMultiply, degree);
        System.out.println("Average Geometric: "+arrayAverageGeometric);
    }



    void setArray(){
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.println("Enter the "+i+"/"+j+" element");
                int currentItem = Integer.parseInt(scanner.nextLine());
                myArray[i][j] = currentItem;
            }
        }

    }
    void setRandomArray(){
        int min = -100;
        int max =100;
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                int diff = max - min;
                myArray[i][j] = random.nextInt(diff + 1);
                myArray[i][j]+= min;
            }
        }
    }

}
